package com.zx5435.pcmoto.demo;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;

public class Demo1 {

    public static void main(String[] args) {

        Object p = JSON.parse("{a:1}");

        System.out.println("p = " + p);

        HashMap<String, Object> h = new HashMap<>();
        h.put("a", 123);
        h.put("name", "qwe");

        String s = JSON.toJSONString(h);
        System.out.println("s = " + s);

    }

}
