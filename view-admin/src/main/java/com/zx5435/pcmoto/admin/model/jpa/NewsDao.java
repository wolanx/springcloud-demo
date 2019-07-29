package com.zx5435.pcmoto.admin.model.jpa;

import com.zx5435.pcmoto.admin.model.base.NewsDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsDao extends JpaRepository<NewsDO, Integer> {

    @Override
    List<NewsDO> findAll();

    List<NewsDO> findAllByCidOrderByViewsDesc(Integer cid);

    List<NewsDO> findAllByTitleAndStatus(String title, Integer status);

}
