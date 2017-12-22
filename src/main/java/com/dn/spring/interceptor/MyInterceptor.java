package com.dn.spring.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 自己定义的通知必须要实现 MethodInterceptor
 */
public class MyInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        before();
        Object result = invocation.proceed();
        return result;
    }

    private void before() {
        System.out.println("自定义MethodInterceptor前置增强");
    }
}
