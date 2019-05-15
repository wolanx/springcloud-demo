package com.zx5435.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SERVICE-NEWS")
public interface NewsRpc {

    @GetMapping("/news/info/3")
    public Object info();

}
