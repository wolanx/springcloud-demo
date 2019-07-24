package com.zx5435.pcmoto.admin.dao;

import com.zx5435.pcmoto.admin.entity.CompanyBspDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyBspDao extends JpaRepository<CompanyBspDO,Integer> {

    List<CompanyBspDO> findAll();

}
