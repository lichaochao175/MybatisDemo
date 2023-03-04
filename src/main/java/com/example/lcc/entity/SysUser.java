package com.example.lcc.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SysUser {
    private Integer id;

    private Integer roleId;

    private String username;

    private String mobile;

    private String password;

    private String sex;

    private String address;

    private Date createTime;

    private Date updateTime;

    private String flagStatus;

    private String ipSource;

    private String ipAddress;


}