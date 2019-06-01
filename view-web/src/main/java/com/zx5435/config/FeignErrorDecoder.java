package com.zx5435.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;

import java.io.IOException;

public class FeignErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        try {
            String body = Util.toString(response.body().asReader());

            JSONObject obj = JSON.parseObject(body);
            String msg = obj.getString("message");
            System.out.println("ErrorDecoder = " + body);
            System.out.println("msg = " + msg);

            return new RuntimeException(msg);
        } catch (IOException e) {
            System.out.println("ErrorDecoder printStackTrace");
            e.printStackTrace();
        }
//        return null;
        return decode(s, response);
    }

}
