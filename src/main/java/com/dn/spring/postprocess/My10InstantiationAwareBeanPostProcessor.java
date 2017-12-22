package com.dn.spring.postprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import java.beans.PropertyDescriptor;

/**
 * 如果是 InstantiationAwareBeanPostProcessor 的类型，也就是说有 @Autowired @Component 等注解
 * user: zhangjianbin <br/>
 * date: 2017/12/22 10:05
 */
public class My10InstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    private static Logger logger = LoggerFactory.getLogger(My10InstantiationAwareBeanPostProcessor.class);

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        logger.info("InstantiationAwareBeanPostProcessor接口 postProcessBeforeInstantiation产生代理bean （spring 的扩展点）");
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info("InstantiationAwareBeanPostProcessor接口 postProcessAfterInitialization对bean进行后置修改");
        return null;
    }
}
