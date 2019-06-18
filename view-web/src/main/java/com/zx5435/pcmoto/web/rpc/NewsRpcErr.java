package com.zx5435.pcmoto.web.rpc;

import com.zx5435.pcmoto.web.mode.entity.NewsDO;
import com.zx5435.pcmoto.web.mode.vo.NewsOneVO;
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
