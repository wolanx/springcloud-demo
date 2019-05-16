package com.zx5435.route;

import com.zx5435.model.NewsModel;
import com.zx5435.rpc.NewsRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class Site {

    @Autowired
    NewsRpc newsRpc;

    @RequestMapping("/")
    public String index(Model m) {
        ArrayList<NewsModel> list = newsRpc.getList();
        System.out.println("list = " + list);

        m.addAttribute("newsList", list);
        return "site/index";
    }

}
