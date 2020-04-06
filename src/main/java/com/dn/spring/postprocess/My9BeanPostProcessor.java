package com.dn.spring.postprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class My9BeanPostProcessor implements BeanPostProcessor {

    private Logger logger = LoggerFactory.getLogger(My6BeanDefinitionRegistryPostProcessor.class);

    @Override
    public Object postProcessAfterInitialization(Object arg0, String arg1)
            throws BeansException {
        logger.info("BeanPostProcessor postProcessAfterInitialization My9BeanPostProcessor 执行");
        return arg0;
    }

    @Override
    public Object postProcessBeforeInitialization(Object arg0, String arg1)
            throws BeansException {
        logger.info("BeanPostProcessor postProcessBeforeInitialization My9BeanPostProcessor 执行");
        return arg0;
    }
}
