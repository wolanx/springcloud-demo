package com.zx5435.pcmoto.web.models.dao;

import com.zx5435.pcmoto.web.models.entity.NewsExtDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface NewsExtDAO {

    @Select("select * from mt_news_ext where id = #{id}")
    NewsExtDO findOne(@Param("id") int id);

}
