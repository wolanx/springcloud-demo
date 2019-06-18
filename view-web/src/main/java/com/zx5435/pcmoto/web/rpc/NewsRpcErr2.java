package com.zx5435.pcmoto.web.rpc;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class NewsRpcErr2 implements FallbackFactory<NewsRpc> {

    @Override
    public NewsRpc create(Throwable throwable) {
//        throwable.printStackTrace();
        System.out.println("NewsRpcErr2 = " + throwable.getMessage());
        return null;
    }

}
