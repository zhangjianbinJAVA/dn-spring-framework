package com.dn.spring.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * SpringContex 上下方获取 工具类
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext args)
            throws BeansException {
        applicationContext = args;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

}
