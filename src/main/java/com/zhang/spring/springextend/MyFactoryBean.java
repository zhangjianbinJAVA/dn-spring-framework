package com.zhang.spring.springextend;


import org.springframework.stereotype.Component;
import org.springframework.beans.factory.FactoryBean;

/**
 * user: zhangjianbin <br/>
 * date: 2018/5/27 16:25
 */
@Component
public class MyFactoryBean implements FactoryBean<com.zhang.spring.springextend.FactoryBean> {

    /**
     * 获取得是 FactoryBean 对象，而不是 MyFactoryBean 对象
     *
     * @return
     * @throws Exception
     */
    @Override
    public com.zhang.spring.springextend.FactoryBean getObject() throws Exception {
        return new com.zhang.spring.springextend.FactoryBean();
    }

    @Override
    public Class<?> getObjectType() {
        return FactoryBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
