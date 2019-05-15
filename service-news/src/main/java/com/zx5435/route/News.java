package com.zx5435.route;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

@RestController
public class News {

    @GetMapping("/news/info/{id}")
    public Object info(@PathVariable int id) {
        LinkedHashMap<String, Object> m = new LinkedHashMap<>();

        m.put("id", id);
        m.put("title", "哈哈是");

        return m;
    }

}
