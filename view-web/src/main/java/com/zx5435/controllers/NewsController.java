package com.zx5435.controllers;

import com.zx5435.mode.vo.NewsOneVO;
import com.zx5435.rpc.NewsRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsController {

    @Autowired
    NewsRpc newsRpc;

    @RequestMapping(value = "/news/{id}")
    public String info(Model m,
                       @PathVariable("id") int id) {
        NewsOneVO info = newsRpc.info(id);

        info.setContent(info.getContent().replace("<!cmsurl />", "//localhost/"));

        m.addAttribute("info", info);

        return "news/info";
    }

}
