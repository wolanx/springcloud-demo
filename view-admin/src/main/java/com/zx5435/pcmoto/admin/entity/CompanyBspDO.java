package com.zx5435.pcmoto.admin.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company_bsp")
@Data
public class CompanyBspDO {

    @Id
    private Integer id;
    private String pinyin;
    private String cname;
    private String sname;

    @Column(name = "ts_create")
    private String tsCreate;

    @Column(name = "ts_update")
    private String tsUpdate;

}
