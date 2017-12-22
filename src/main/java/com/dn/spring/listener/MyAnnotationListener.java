package com.dn.spring.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 注解方式监听器
 * user: zhangjianbin <br/>
 * date: 2017/12/21 19:38
 */
@Component
public class MyAnnotationListener {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Async("myListener")//如果不指定名字，会使用缺省的“asyncExecutor”
    @EventListener
    public void myListener(MyEvent event) {
        try {
            //判断事件为MyEvent时候执行
            if (event instanceof MyEvent) {
                logger.info("注解方式监听器线程暂停");
                Thread.sleep(2000);//线程休眠
                //强制转换
                MyEvent evt = (MyEvent) event;
                System.out.println("***********注解方式监听器***********");
                //执行自定义事件中的自定义方法
                evt.myevent();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
