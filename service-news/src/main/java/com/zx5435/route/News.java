package com.zx5435.route;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@RestController
public class News {

    @GetMapping("/news/list")
    public ArrayList<Object> info() {
        ArrayList<Object> arr = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            LinkedHashMap<String, Object> m = new LinkedHashMap<>();
            m.put("id", i);
            m.put("title", "哈哈是" + i);
            arr.add(m);
        }

        return arr;
    }

    @GetMapping("/news/info/{id}")
    public Object info(@PathVariable int id) {
        LinkedHashMap<String, Object> m = new LinkedHashMap<>();

        m.put("id", id);
        m.put("title", "哈哈是");

        return m;
    }

}
