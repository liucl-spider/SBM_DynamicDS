package com.liucl.test2.core;

public class DataSourceHolder {
	public static final String masterDataSource_ = "master";
	public static final String clusterDataSource_ = "cluster";
	//使用ThreadLocal把数据源与当前线程绑定
    private static final ThreadLocal<String> dataSources = new ThreadLocal<String>();

    public static void setDataSource(String dataSourceName) {
        dataSources.set(dataSourceName);
    }

    public static String getDataSource() {
        return (String) dataSources.get();
    }

    public static void clearDataSource() {
        dataSources.remove();
    }
}
