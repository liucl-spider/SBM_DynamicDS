package com.liucl.test2.core;


import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicRoutingDataSource extends AbstractRoutingDataSource{
	
	@Override
    protected Object determineCurrentLookupKey() {
        String dataSourceName = DataSourceHolder.getDataSource();
        System.out.println("determineCurrentLookupKey:"+dataSourceName);
        //dynamicDataSource(dataSourceName);
        return dataSourceName;
    }
	
//	private void dynamicDataSource(String dataSourceName) {
//        try{
//            Object dataSource = getDataSource(dataSourceName);//缓存中查数据源
//            if(dataSource==null){//缓存没有
//                DruidDataSource dbDataSource = selectDataSource(dataSourceName);//数据库中查
//                if(dbDataSource==null){
//                    throw new RuntimeException("未找到对应的数据源系统配置");
//                }
//                addDataSource(dataSourceName, dbDataSource);//数据库中查到的数据源放入缓存
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//	
//	private Object getDataSource(String dataSourceName) {
//        return .get(dataSourceName);
//    }

}
