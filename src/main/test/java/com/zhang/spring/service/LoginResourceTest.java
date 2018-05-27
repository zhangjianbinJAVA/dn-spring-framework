package com.zhang.spring.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * user: zhangjianbin <br/>
 * date: 2018/5/27 7:46
 */
public class LoginResourceTest {
    @Test
    public void login() throws Exception {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("config/zhang/applicationContext-zhang-beans.xml");
        //从容器中 获取bean
        LoginResource loginResource = (LoginResource) applicationContext.getBean("loginResource");

        loginResource.login();

    }

}