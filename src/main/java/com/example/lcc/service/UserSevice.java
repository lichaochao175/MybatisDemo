package com.example.lcc.service;

import com.example.lcc.entity.po.RoleMenu;
import com.example.lcc.entity.po.User;
import com.example.lcc.mapper.UserMapper;

import java.util.List;

/**
 * @author Licc
 * @description:
 * @date 2023/5/18 6:37 PM
 */

public interface UserSevice {

    User getRole(String mobile);
}