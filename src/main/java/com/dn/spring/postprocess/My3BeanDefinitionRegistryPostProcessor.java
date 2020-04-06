package com.dn.spring.postprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * PriorityOrdered  实现该接口可以控制类的执行顺序
 */
@Component
public class My3BeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {

    private Logger logger = LoggerFactory.getLogger(My3BeanDefinitionRegistryPostProcessor.class);


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
            throws BeansException {
        logger.info("BeanDefinitionRegistryPostProcessor PriorityOrdered postProcessBeanFactory My3BeanDefinitionRegistryPostProcessor");

    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry arg0)
            throws BeansException {
        logger.info("BeanDefinitionRegistryPostProcessor PriorityOrdered postProcessBeanDefinitionRegistry My3BeanDefinitionRegistryPostProcessor");

    }

    @Override
    public int getOrder() {
        return 0;
    }

}
