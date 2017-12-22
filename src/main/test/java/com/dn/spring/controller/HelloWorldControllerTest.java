package com.dn.spring.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//指定测试用例的运行器 这里是指定了Junit4
@ContextConfiguration(locations = {"classpath:config/spring/springmvc.xml", "classpath:config/spring/applicationContext-core.xml"})
//指定Spring的配置文件 /为classpath下
public class HelloWorldControllerTest {


    @Test
    public void  helloTest(){

    }

}