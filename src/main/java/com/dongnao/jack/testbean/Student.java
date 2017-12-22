package com.dongnao.jack.testbean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Student {

    public List<String> list = new ArrayList<String>() {
        {
            add("a");
            add("b");
            add("c");
        }
    };

    public String param;

    public Map map;

    public List mylist;

    public List getMylist() {
        return mylist;
    }

    public void setMylist(List mylist) {
        this.mylist = mylist;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
