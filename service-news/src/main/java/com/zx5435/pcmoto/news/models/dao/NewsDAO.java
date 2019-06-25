package com.zx5435.pcmoto.news.models.dao;

import com.zx5435.pcmoto.news.models.entity.NewsDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface NewsDAO {

    @Select("select * from mt_news where id = #{id}")
    NewsDO findOne(@Param("id") int id);

    @Select("select * from mt_news where 1 order by id desc limit #{offset},#{limit}")
    ArrayList<NewsDO> findByRange(@Param("offset") int offset,
                                  @Param("limit") int pageSize);

}
