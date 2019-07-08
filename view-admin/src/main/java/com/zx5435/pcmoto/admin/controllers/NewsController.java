package com.zx5435.pcmoto.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsController {

    @RequestMapping("/news")
    public String index() {
        return "news/index";
    }

    @RequestMapping("/news/info")
    public String info() throws Exception {
        if (true) {
            throw new Exception("qwe");
        }
        return "news/index";
    }

}
