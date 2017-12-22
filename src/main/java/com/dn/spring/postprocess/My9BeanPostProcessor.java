package com.dn.spring.postprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


public class My9BeanPostProcessor implements BeanPostProcessor {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Object postProcessAfterInitialization(Object arg0, String arg1)
            throws BeansException {
        // TODO Auto-generated method stub
        logger.info("My9BeanPostProcessor postProcessAfterInitialization 执行");
        return null;
    }

    @Override
    public Object postProcessBeforeInitialization(Object arg0, String arg1)
            throws BeansException {
        // TODO Auto-generated method stub
        logger.info("My9BeanPostProcessor postProcessBeforeInitialization 执行");
        return null;
    }
}
