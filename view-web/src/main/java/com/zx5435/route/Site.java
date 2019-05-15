package com.zx5435.route;

import com.zx5435.rpc.NewsRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Site {

    @Autowired
    NewsRpc newsRpc;

    @RequestMapping("/")
    public String index(Model m) {
        m.addAttribute("newsList", 123);

        Object info = newsRpc.info();
        System.out.println("info = " + info);

        return "site/index";
    }

}
