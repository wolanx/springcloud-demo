package com.zx5435.pcmoto.admin.model.base;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket_wu")
@Data
public class TicketWuDO {

    @Id
    private Integer id;

    private String pnr_name;
    private Integer customer_id;
    private Integer bsp_id;

    @Column(name = "ts_create")
    private String tsCreate;

    @Column(name = "ts_update")
    private String tsUpdate;

}
