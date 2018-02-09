package com.liucl.test2.core;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class DataSourceRouter {

    private final String[] QUERY_PREFIX = {"select"};
    
    
    @Pointcut("execution( * com.liucl.test2.dao..*.*(..))")
    public void daoAspect() {
    	System.out.println("dao method");
    }

    @Before("daoAspect()")
    public void switchDataSource(JoinPoint point) {
    	System.out.println("before");
        Boolean isQueryMethod = isQueryMethod(point.getSignature().getName());
        if (isQueryMethod) {
            DataSourceHolder.setDataSource(DataSourceKey.master.name());
        }else{
        	DataSourceHolder.setDataSource(DataSourceKey.cluster.name());
        }
    }

    @After("daoAspect()")
    public void restoreDataSource(JoinPoint point) {
    	System.out.println("after");
    	DataSourceHolder.clearDataSource();
    }

    private Boolean isQueryMethod(String methodName) {
        for (String prefix : QUERY_PREFIX) {
            if (methodName.startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }

}
