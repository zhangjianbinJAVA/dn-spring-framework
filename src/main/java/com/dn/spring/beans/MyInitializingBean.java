package com.dn.spring.beans;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * user: zhangjianbin <br/>
 * date: 2017/12/21 21:41
 */
@Component
public class MyInitializingBean implements InitializingBean {

    /**
     * 当bean 实例化之后就会调用接口中的 afterPropertiesSet 这个方法
     * 在这个方法中可以做一些初始化的工作（在bean实例化以后）
     * <p>
     * 这个就是 bean 标签中的 init-method 的执行过程
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("MyInitializingBean bean 实例化之后就会调用接口中的 afterPropertiesSet 这个方法");
    }
}
