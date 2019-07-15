package com.zx5435.pcmoto.admin.controllers;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

@Controller
@Slf4j
public class NewsController {

    @Autowired
    Aasdasd aasdasd;

    @Value("${info.author}")
    public String name;

    @RequestMapping("/news")
    public String index(Model m) {
        m.addAttribute("arr");

        log.info(name);

        System.out.println("aasdasd = " + aasdasd.author);

        ConcurrentHashMap<String, Object> o = new ConcurrentHashMap<String, Object>();

        ReentrantLock r = new ReentrantLock();
        r.lock();
        r.unlock();

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

@Component
@ConfigurationProperties(prefix = "info")
@Data
class Aasdasd {
    public String author;
}
