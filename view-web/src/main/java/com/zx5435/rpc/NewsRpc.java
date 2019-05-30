package com.zx5435.rpc;

import com.zx5435.mode.entity.NewsDO;
import com.zx5435.mode.vo.NewsOneVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@FeignClient(value = "SERVICE-NEWS",
        /*fallback = NewsRpcErr.class,*/
        fallbackFactory = NewsRpcErr2.class,
        configuration = FeignClientsConfig.class)
@Repository
public interface NewsRpc {

    @GetMapping("/news/list")
    public ArrayList<NewsDO> getList();

    @GetMapping("/news/info")
    public NewsOneVO info(@RequestParam("id") int id);

}
