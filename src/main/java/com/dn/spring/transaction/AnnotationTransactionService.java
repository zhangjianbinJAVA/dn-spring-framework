package com.dn.spring.transaction;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 注解事物测试
 *
 * @author: zh
 * @date: 2020/4/2/002 22:11
 */
@Service
public class AnnotationTransactionService {

    @Transactional
    public String save() {
        return "ok";
    }
}
