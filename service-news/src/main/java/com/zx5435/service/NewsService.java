package com.zx5435.service;

import com.zx5435.config.BadRequestHttpException;
import com.zx5435.config.NotFoundHttpException;
import com.zx5435.models.dao.NewsDAO;
import com.zx5435.models.dao.NewsExtDAO;
import com.zx5435.models.entity.NewsDO;
import com.zx5435.models.entity.NewsExtDO;
import com.zx5435.models.vo.NewsOneVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NewsService {

    @Autowired
    NewsDAO newsDAO;

    @Autowired
    NewsExtDAO newsExtDAO;

    public NewsOneVO getOne(int id) {
        NewsDO res = newsDAO.findOne(id);
        if (id == 1234) {
            throw new BadRequestHttpException("实验下error");
        }
        if (res == null) {
            throw new NotFoundHttpException("没找到啊");
        }

        NewsOneVO ret = new NewsOneVO();
        BeanUtils.copyProperties(res, ret);

        NewsExtDO ext = newsExtDAO.findOne(id);
        ret.setContent(ext.getContent().replace("<!cmsurl />", "//localhost/"));

        // System.out.println("ret = " + ret);

        return ret;
    }

    public ArrayList<NewsDO> getList(int page, int pageSize) {
        int offset = (page - 1) * pageSize; // TODO
        return newsDAO.findByRange(offset, pageSize);
    }

}
