package com.example.lcc.service.impl;

import com.example.lcc.controller.RoleMenuController;
import com.example.lcc.entity.po.RoleMenu;
import com.example.lcc.entity.po.User;
import com.example.lcc.entity.po.UserMenu;
import com.example.lcc.service.UserMenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author Licc
 * @description: 菜单
 * @date 2023/5/18 6:50 PM
 */
public class UserMenuServiceImpl  implements UserMenuService {

    private final Logger log = LoggerFactory.getLogger(UserMenuServiceImpl.class);

    private  UserSeviceImpl  userSeviceImpl;
    private RoleMenuServiceImpl roleMenuServiceImpl;


    public UserMenuServiceImpl( UserSeviceImpl  userSeviceImpl,RoleMenuServiceImpl roleMenuServiceImpl) {
        this.userSeviceImpl = userSeviceImpl;
        this.roleMenuServiceImpl=roleMenuServiceImpl;
    }

    @Override
    public List<UserMenu> getMenus(String mobile) {
        //获取当前用户角色
        User user = userSeviceImpl.getRole(mobile);
        //获取当前用户角色所有菜单
        List<RoleMenu> menus = roleMenuServiceImpl.getRole(user.getRoleId());
        if(CollectionUtils.isEmpty(menus)){
            log.error("menus:{}",menus);
            //todo 抛出该角色下无任何可查看菜单
        }
        //遍历所有可查看菜单
        return null;
    }
}

