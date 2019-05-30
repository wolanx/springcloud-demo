package com.zx5435.rpc;

import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;

import java.io.IOException;

public class FeignClientsConfig implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        try {
            String body = Util.toString(response.body().asReader());
            System.out.println("body = " + body);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
