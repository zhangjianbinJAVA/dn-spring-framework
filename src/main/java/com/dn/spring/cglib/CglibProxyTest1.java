package com.dn.spring.cglib;

import com.dn.spring.cglib.simple.TargetClass;
import com.dn.spring.cglib.simple.TargetInterceptor;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * spring 中采用 回调过滤器的方式
 */
public class CglibProxyTest1 {

    public static void main(String[] args) {
        //Enhancer类是CGLib中的一个字节码增强器
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(TargetClass.class);

        enhancer.setCallbackFilter(new MethodCallBackFilter());
        //这里定义了3个增强，3个回调
        Callback c1 = new TargetInterceptor();
        //不做任何操作，即不增强
        Callback c2 = NoOp.INSTANCE;
        //调用增强的方法，并返回增加的方法值
        Callback c3 = new FixedValueClass();

        Callback[] callbacks = new Callback[]{c1, c2, c3};
        enhancer.setCallbacks(callbacks);

        TargetClass cglibProxy = (TargetClass) enhancer.create();
        cglibProxy.add();
        cglibProxy.del();
        cglibProxy.update();
    }

}
