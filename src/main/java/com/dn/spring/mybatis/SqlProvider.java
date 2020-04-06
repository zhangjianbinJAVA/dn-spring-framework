package com.dn.spring.mybatis;

/**
 * @author: zh
 * @date: 2020/4/4/004 11:47
 */
public class SqlProvider {

    public String count(Integer id) {
        String sql = "SELECT count(1) from t_user where id=" + id;
        return sql;
    }
}
