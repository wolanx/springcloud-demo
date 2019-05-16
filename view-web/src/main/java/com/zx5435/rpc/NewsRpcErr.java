package com.zx5435.rpc;

import com.zx5435.model.NewsModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class NewsRpcErr implements NewsRpc {

    @Override
    public ArrayList<NewsModel> getList() {
        System.out.println("true = error");
        return null;
    }

    @Override
    public Object info() {
        return null;
    }

}
