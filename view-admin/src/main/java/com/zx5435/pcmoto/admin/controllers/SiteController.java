package com.zx5435.pcmoto.admin.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class SiteController {

    @RequestMapping("/")
    public String index() {
        log.debug("123");
        return "site/index";
    }

}
