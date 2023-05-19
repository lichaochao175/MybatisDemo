package com.example.lcc.service;

import com.example.lcc.entity.po.UserMenu;

import java.util.List;

/**
 * @author Licc
 * @description:  角色下可见菜单
 * @date 2023/5/18 6:50 PM
 */
public interface UserMenuService {

    List<UserMenu> getMenus(String mobile);
}
