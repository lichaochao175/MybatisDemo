package com.example.lcc.controller;


import com.example.lcc.comm.Result;
import com.example.lcc.entity.po.RoleMenu;
import com.example.lcc.service.impl.RoleMenuServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


import java.util.List;


/**
 * @author Licc
 * @date 2023/1/8 11:06 AM
 */
@RestController
@RequestMapping("/sysmenu")
public class RoleMenuController {
    private final Logger log = LoggerFactory.getLogger(RoleMenuController.class);

    private   RoleMenuServiceImpl roleMenuServiceImpl;
    public RoleMenuController(RoleMenuServiceImpl roleMenuServiceImpl){
        this.roleMenuServiceImpl = roleMenuServiceImpl;
    }

    //获取用户全部菜单
    @GetMapping("/get/AllMenus")
    public Result<List<RoleMenu>> menus(@RequestBody String mobile) {

        return null;
    }


}