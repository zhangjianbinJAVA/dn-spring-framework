package com.dn.spring.mybatis.service;

import com.dn.spring.mybatis.bean.UserDo;
import com.dn.spring.mybatis.dao.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * spring 事务测试
 *
 * @author: zh
 * @date: 2020/4/3/003 22:11
 */
@Service
public class UserManageService {

    private Logger logger = LoggerFactory.getLogger(UserManageService.class);

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private InsertUserService insertUserService;

    /**
     * 只有一个事务时，事务传播机制是不启作用的
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public void execut() {
        UserDo userDo = new UserDo();
        userDo.setName("10");
        userDo.setAge(10);
        userMapper.save(userDo);
        logger.info("execut-1 事务执行");

        //事务二
        insertUserService.execute();


    }
}
