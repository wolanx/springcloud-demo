package com.zx5435.pcmoto.admin.model.base;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Data
public class UserDO {

    @Id
    private Integer id;
    private String username;
    private String realname;
    private String password;
    private String salt;
    private Integer status;
//    private String created_at;
//    private String updated_at;

}
