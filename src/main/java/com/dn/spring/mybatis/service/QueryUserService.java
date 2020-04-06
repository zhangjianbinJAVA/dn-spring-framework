package com.dn.spring.mybatis.service;

import com.dn.spring.mybatis.bean.UserDo;
import com.dn.spring.mybatis.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zh
 * @date: 2020/4/3/003 21:33
 */
@Service
public class QueryUserService {
    @Autowired
    private UserMapper userMapper;

    public UserDo oneUser(Integer id) {
        return userMapper.oneUser(id);
    }

    public List<UserDo> list() {
        return userMapper.list();
    }
}
