package com.zx5435.pcmoto.admin.controllers;

import com.zx5435.pcmoto.admin.entity.NewsDO;
import com.zx5435.pcmoto.admin.service.NewService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@Controller
public class NewsController {

    @Autowired
    HttpServletRequest request;

    @Autowired
    NewService newService;

    @RequestMapping("/news")
    public String index(Model m) {
        log.info("news");

        List<NewsDO> res = newService.getList();
        log.info("news:", res);

        m.addAttribute("arr", res);

        return "news/list";
    }

}
