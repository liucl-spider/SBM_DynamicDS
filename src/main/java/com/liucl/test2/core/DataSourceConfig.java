package com.liucl.test2.core;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

@Configuration
public class DataSourceConfig {
	
	private Map<Object, Object> dataSourceMap = new HashMap<>(2);
	
	@ConfigurationProperties(prefix = "spring.datasource.master")
    @Bean(name = "master", initMethod="init")
	@Primary
    public DataSource master() {
		System.out.println("master");
		DataSource master = DruidDataSourceBuilder.create().build();
		dataSourceMap.put(DataSourceKey.master.name(), master);
		return master;
    }
	
	
	@ConfigurationProperties(prefix = "spring.datasource.cluster")
    @Bean(name = "cluster", initMethod="init")
    public DataSource cluster() {
		System.out.println("cluster");
		DataSource cluster = DruidDataSourceBuilder.create().build();
		dataSourceMap.put(DataSourceKey.cluster.name(), cluster);
		return cluster;
    }
	
	@Bean(name = "dynamicDataSource")
    public DataSource dynamicDataSource() {
		
		System.out.println("dynamic");
        DynamicRoutingDataSource dynamicRoutingDataSource = new DynamicRoutingDataSource();
        System.out.println(dataSourceMap.get(DataSourceKey.master.name()).toString());
        // 将 master 数据源作为默认指定的数据源
        dynamicRoutingDataSource.setDefaultTargetDataSource(dataSourceMap.get(DataSourceKey.master.name()));
        // 将 master 和 slave 数据源作为指定的数据源
        dynamicRoutingDataSource.setTargetDataSources(dataSourceMap);
        //dynamicRoutingDataSource.afterPropertiesSet();
        return dynamicRoutingDataSource;
    }   
	
	@Bean(name="sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactoryBean() {
		master();
		cluster();
		System.out.println("factory");
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        // 配置数据源，此处配置为关键配置，如果没有将 dynamicDataSource 作为数据源则不能实现切换
        sqlSessionFactoryBean.setDataSource(dynamicDataSource());
        return sqlSessionFactoryBean;
    }
	
	@Bean(name="transactionManager")
	public DataSourceTransactionManager transactionManager(){
		return new DataSourceTransactionManager(dynamicDataSource());
	}
	
}
