package com.example.lcc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
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