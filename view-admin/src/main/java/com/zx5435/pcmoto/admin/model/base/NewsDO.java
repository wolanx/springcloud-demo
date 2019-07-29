package com.zx5435.pcmoto.admin.model.base;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "mt_news")
@TableName(value = "mt_news")
public class NewsDO {

    @Id
    private Integer id;
    private Integer cid;
    private String title;
    private String description;
    private String thumb;
    private String source_name;
    private Integer views;
    private Integer uid;
    private Integer status;
    private Timestamp updated_at;

    @Override
    public String toString() {
        return "NewsDO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", thumb='" + thumb + '\'' +
                ", source_name='" + source_name + '\'' +
                ", views='" + views + '\'' +
                ", uid=" + uid +
                ", status=" + status +
                '}';
    }

}
