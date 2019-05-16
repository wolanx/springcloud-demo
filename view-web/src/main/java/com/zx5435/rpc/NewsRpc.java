package com.zx5435.rpc;

import com.zx5435.model.NewsModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@FeignClient(value = "SERVICE-NEWS", fallback = NewsRpcErr.class)
public interface NewsRpc {

    @GetMapping("/news/list")
    public ArrayList<NewsModel> getList();

    @GetMapping("/news/info/3")
    public Object info();

}
