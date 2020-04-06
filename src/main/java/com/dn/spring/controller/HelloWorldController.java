package com.dn.spring.controller;

import com.dongnao.jack.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.geom.RectangularShape;
import java.util.HashMap;
import java.util.Map;

/**
 * user: zhangjianbin <br/>
 * date: 2017/12/4 13:51
 */
@Controller
public class HelloWorldController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);


    @RequestMapping("/")
    public String helloTest() {
        LOGGER.info("index");
        return "Index";
    }


    @RequestMapping("/query-student")
    @ResponseBody
    public Map student(@RequestParam(value = "age") Integer age, @RequestBody(required = false) String body) {
        HashMap<Object, Object> result = new HashMap<>();

        result.put("zhang", "jianbin");
        result.put("age", age);
        result.put("body", body);
        return result;
    }
}
