package com.dn.spring.cglib.simple;

import net.sf.cglib.proxy.Enhancer;

/**
 * 3
 * cglib 测试
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        //Enhancer类是CGLib中的一个字节码增强器
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(TargetClass.class);
        enhancer.setCallback(new TargetInterceptor());

        TargetClass cglibProxy = (TargetClass) enhancer.create();
        cglibProxy.add();
        //        cglibProxy.del();
        //        cglibProxy.update();
    }

}
