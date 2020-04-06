package com.dn.spring.mybatis.service;

import com.dn.spring.mybatis.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: zh
 * @date: 2020/4/3/003 21:37
 */
@Service
public class UpdateUserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public int update(Integer id) {
        return userMapper.update(id);
    }
}
