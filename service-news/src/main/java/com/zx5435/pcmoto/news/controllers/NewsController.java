package com.zx5435.pcmoto.news.controllers;

import com.zx5435.pcmoto.news.models.entity.NewsDO;
import com.zx5435.pcmoto.news.models.vo.NewsOneVO;
import com.zx5435.pcmoto.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping("/news/info")
    @ResponseBody
    public NewsOneVO info(@RequestParam int id) {
        //
        return newsService.getOne(id);
    }

    @GetMapping("/news/list")
    public ArrayList<NewsDO> list(@RequestParam(value = "page", defaultValue = "1") int page,
                                  @RequestParam(value = "per-page", defaultValue = "20") int pageSize) {
        return newsService.getList(page, pageSize);
    }

}
