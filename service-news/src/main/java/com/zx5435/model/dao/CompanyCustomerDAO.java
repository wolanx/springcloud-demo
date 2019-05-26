package com.zx5435.model.dao;

import com.zx5435.model.entity.CompanyCustomerDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CompanyCustomerDAO {

    @Select("select * from company_customer")
    List<CompanyCustomerDO> list();

    @Select("select * from company_customer order by id asc limit #{offset},#{limit}")
    List<CompanyCustomerDO> findAllRange(@Param("offset") int offset,
                                         @Param("limit") int limit);

}
