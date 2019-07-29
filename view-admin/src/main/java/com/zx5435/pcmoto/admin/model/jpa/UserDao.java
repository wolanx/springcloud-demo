package com.zx5435.pcmoto.admin.model.jpa;

import com.zx5435.pcmoto.admin.model.base.UserDO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<UserDO, Integer> {

    @Override
    List<UserDO> findAll();

    @Override
    Page<UserDO> findAll(Pageable pageable);

    @Override
    Optional<UserDO> findById(Integer integer);

    UserDO findOneByUsername(String username);

}
