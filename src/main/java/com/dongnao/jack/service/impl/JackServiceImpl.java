package com.dongnao.jack.service.impl;

import com.dongnao.jack.annotation.Service;
import com.dongnao.jack.service.JackService;

@Service("JackServiceImpl")
public class JackServiceImpl implements JackService {
    
    public String query(String param) {
        return this.getClass().getName() + "query";
    }
    
    public String insert(String param) {
        return this.getClass().getName() + "insert";
    }
    
    public String update(String param) {
        return this.getClass().getName() + "update";
    }
    
}
