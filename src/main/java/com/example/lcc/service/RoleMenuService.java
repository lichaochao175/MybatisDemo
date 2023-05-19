package com.example.lcc.service;

import com.example.lcc.entity.po.RoleMenu;


import java.util.List;

/**
 * @author Licc
 * @date 2023/1/8 11:07 AM
 */
public interface RoleMenuService {

     List<RoleMenu> getRole(Long id);
}