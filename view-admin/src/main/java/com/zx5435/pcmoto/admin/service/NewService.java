package com.zx5435.pcmoto.admin.service;

import com.zx5435.pcmoto.admin.entity.NewsDO;
import org.springframework.ui.Model;

import java.util.List;

public interface NewService {

    List<NewsDO> getList();

}
