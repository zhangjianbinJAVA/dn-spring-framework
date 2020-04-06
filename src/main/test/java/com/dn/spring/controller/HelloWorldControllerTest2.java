package com.dn.spring.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Map;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)//指定测试用例的运行器 这里是指定了Junit4
@ContextConfiguration(locations =
        {"classpath*:config/spring/springmvc.xml",
                "classpath*:config/spring/applicationContext-*.xml"})
//指定Spring的配置文件 /为classpath下
//@WebAppConfiguration //调用Java Web组件，如自动注入ServletContext Bean等
public class HelloWorldControllerTest2 {

    private MockHttpServletRequest request;

    @InjectMocks
    private HelloWorldController controller;       //需要测试的Controller

    @Before
    public void setUp() throws Exception {
        //初始化
        MockitoAnnotations.initMocks(this);

        //构建mvc环境
        request = new MockHttpServletRequest();
    }

    /**
     * 直接调用Controller方法测试。
     *
     * @throws Exception
     */
    @Test
    public void helloTest() throws Exception {
        //request.addParameter("age", "3");
        Map student = controller.student(3,"zhangbody");
        System.out.println(student);
    }
}