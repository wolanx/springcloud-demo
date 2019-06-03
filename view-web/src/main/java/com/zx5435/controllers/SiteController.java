package com.zx5435.controllers;

import com.zx5435.mode.entity.NewsDO;
import com.zx5435.rpc.NewsRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class SiteController {

    @Autowired
    NewsRpc newsRpc;

    @RequestMapping("/")
    public String index(Model m) {
        ArrayList<NewsDO> list = newsRpc.getList();
        m.addAttribute("newsList", list);

        return "site/index";
    }

    @RequestMapping("/site/error")
    public String siteError(Model m) {
        m.addAttribute("message", "error test.");

        return "site/error";
    }

}
