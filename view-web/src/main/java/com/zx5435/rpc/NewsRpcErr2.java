package com.zx5435.rpc;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class NewsRpcErr2 implements FallbackFactory<NewsRpc> {

    @Override
    public NewsRpc create(Throwable throwable) {
//        throwable.printStackTrace();
        System.out.println("throwable = " + throwable.getMessage());
        return null;
    }

}
