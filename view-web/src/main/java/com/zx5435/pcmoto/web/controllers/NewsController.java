package com.zx5435.pcmoto.web.controllers;

import cn.hutool.http.useragent.UserAgent;
import cn.hutool.http.useragent.UserAgentUtil;
import com.zx5435.pcmoto.web.mode.vo.NewsOneVO;
import com.zx5435.pcmoto.web.rpc.NewsRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class NewsController {

    @Autowired
    NewsRpc newsRpc;

    @Autowired
    HttpServletRequest request;

    @RequestMapping(value = "/news/{id}")
    public String info(Model m, @PathVariable("id") int id) {
        NewsOneVO info = newsRpc.info(id);
        m.addAttribute("info", info);

        String uaStr = request.getHeader("user-agent");
        UserAgent ua = UserAgentUtil.parse(uaStr);

        if (ua.isMobile()) {
            return "news/info_m";
        } else {
            return "news/info";
        }
    }

}
