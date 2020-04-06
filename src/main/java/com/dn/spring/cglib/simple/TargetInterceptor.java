package com.dn.spring.cglib.simple;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 2
 * 相当于切面，增加类
 */
public class TargetInterceptor implements MethodInterceptor {

    private void before() {
        System.out.println("cglib前置增强");
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
        System.out.println(method.getName());
        before();
        //调用被代理类的具体方法中
        proxy.invokeSuper(obj, args);
        //method.invoke(obj, args);
        after();
        return null;
    }

    private void after() {
        System.out.println("cglib后置增强");
    }

}
