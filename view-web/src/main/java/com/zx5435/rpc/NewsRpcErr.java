package com.zx5435.rpc;

import com.zx5435.mode.entity.NewsDO;
import com.zx5435.mode.vo.NewsOneVO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class NewsRpcErr implements NewsRpc {

    @Override
    public ArrayList<NewsDO> getList() {
        System.out.println("true = error");
        return null;
    }

    @Override
    public NewsOneVO info(int id) {
        System.out.println("id = " + id);
        return null;
    }

}
