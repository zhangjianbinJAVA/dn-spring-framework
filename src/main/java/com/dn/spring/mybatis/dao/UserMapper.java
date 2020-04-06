package com.dn.spring.mybatis.dao;

import com.dn.spring.mybatis.SqlProvider;
import com.dn.spring.mybatis.bean.UserDo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: zh
 * @date: 2020/4/3/003 21:27
 */
public interface UserMapper {

    int save(UserDo userDo);

    int update(Integer id);

    UserDo selectUserById(@Param("id") Integer id);

    UserDo oneUser(Integer id);

    List<UserDo> list();

    int count();

    int delete(Integer id);

    /**
     * 自定义动态sql
     *
     * @param id
     * @return
     */
    @SelectProvider(type = SqlProvider.class, method = "count")
    int countProvider(Integer id);
}
