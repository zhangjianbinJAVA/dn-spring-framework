package com.zhang.spring.springextend;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * user: zhangjianbin <br/>
 * date: 2018/5/27 16:19
 */
@Component
public class MyInitializingBean implements InitializingBean {


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyInitializingBean 该方法在Bean的属性都设置值后被调用");
    }
}
