package com.dn.spring.controller;

import com.dn.spring.aop.IntroductionIntf;
import com.dn.spring.listener.MyEvent;
import com.dn.spring.postprocess.Student;
import com.dn.spring.schema.People;
import com.dn.spring.service.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/spring/applicationContext-*.xml")
public class MyTest implements ApplicationContextAware {
    //ApplicationContextAware 实现这个接口获取  ApplicationContext 上下文

    private static final Logger LOGGER = LoggerFactory.getLogger(MyTest.class);

    public ApplicationContext context;

    /**
     * 对beanDifinition的修改
     */
    @Test
    public void test1() {
        Student s = (Student) context.getBean("jackstudent");
        System.out.println(s.getUsername());
        System.out.println(s.getPassword());

        //启动过程中添加bean的属性值的结果
        System.out.println(s.getSchool());

        LOGGER.info("test1 测试");
    }

    /**
     * 自定义标签
     */
    @Test
    public void test2() {
        People p = (People) context.getBean("cutesource");
        System.out.println(p);
    }


    /**
     * service 实现化
     */
    @Test
    public void test3() {
        MyService service = (MyService) context.getBean("myservice");
        System.out.println(service.getClass());
//        MyService service2 = (MyService) context.getBean("myservice2");
//        System.out.println(service2.getClass());
        service.execute();
//        service2.execute();
    }

    /**
     * 通过aop动态注入方法 到 myservice bean 中
     */
    @Test
    public void test4() {
        IntroductionIntf service = (IntroductionIntf) context.getBean("myservice");
        service.extend();
    }


    /**
     * 监听器测试
     */
    @Test
    public void test5() {
        MyEvent myEvent = new MyEvent("自定义监听器");
        // 发布事件，给所有的监听者
        context.publishEvent(myEvent);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取 ApplicationContext 上下文
     *
     * @param arg0
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext arg0)
            throws BeansException {
        this.context = arg0;
    }
}
