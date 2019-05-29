package com.zx5435.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

@RestController
public class User {

    @GetMapping("/user/info")
    public Object info() {
        LinkedHashMap<String, Object> m = new LinkedHashMap<>();

        m.put("id", 123);
        m.put("title", "user-aaaa");

        return m;
    }

}
