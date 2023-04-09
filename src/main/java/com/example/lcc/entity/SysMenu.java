package com.example.lcc.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;


@Data
public class SysMenu  implements Serializable {

    private Integer id;

    private String name;

    private String parentId;

    private Date createTime;

    private Date updateTime;

    private String permission;

    private String path;

    private String icon;

    private Integer sortOrder;

    private String keepAlive;

    private String type;

    private String delFlag;

    private String createBy;




}