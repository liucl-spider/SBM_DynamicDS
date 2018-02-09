package com.liucl.test2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * 多数据源
 *
 */
@SpringBootApplication
@PropertySource(value = {"classpath:datasource.properties"})
@MapperScan("com.liucl.test2.dao")  //扫描的是mapper.xml中namespace指向值的包位置
public class Application 
{
	public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
