package com.zx5435.pcmoto.api.route;

import cn.hutool.core.date.DateUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

@RestController
public class Site {

    @GetMapping("/")
    public Object index() {
        LinkedHashMap<String, Object> m = new LinkedHashMap<>();

        m.put("status", 200);
        m.put("code", 0);
        m.put("message", "success");
        m.put("data", DateUtil.date());

        return m;
    }

}
