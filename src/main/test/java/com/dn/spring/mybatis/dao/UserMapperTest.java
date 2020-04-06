package com.dn.spring.mybatis.dao;

import com.dn.spring.BaseTest;
import com.dn.spring.mybatis.bean.UserDo;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author: zh
 * @date: 2020/4/4/004 11:57
 */
public class UserMapperTest extends BaseTest {
    private Logger logger = LoggerFactory.getLogger(UserMapperTest.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    public void save() {
    }

    @Test
    public void update() {
    }

    @Test
    public void oneUser() {
    }

    @Test
    public void list() {
    }

    @Test
    public void count() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void countProvider() {
        int count = userMapper.countProvider(1);
        logger.info("countProvider:[{}]", count);
    }

    @Test
    public void selectUserById() {
        UserDo userDo = userMapper.selectUserById(1);
        logger.info("selectUserById:[{}]", userDo);
    }
}