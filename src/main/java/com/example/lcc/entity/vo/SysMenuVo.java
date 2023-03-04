package com.example.lcc.entity.vo;

import com.example.lcc.entity.SysMenu;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class SysMenuVo implements Serializable {

    private Integer id;

    private String name;

    private Integer menuId;

    private SysMenu sysMenu;

}