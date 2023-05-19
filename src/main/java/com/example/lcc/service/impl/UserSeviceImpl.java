package com.example.lcc.service.impl;

import com.example.lcc.entity.po.RoleMenu;
import com.example.lcc.entity.po.User;
import com.example.lcc.mapper.UserMapper;
import com.example.lcc.service.UserSevice;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @author Licc
 * @description:
 * @date 2023/5/18 6:37 PM
 */
@Service
public class UserSeviceImpl implements UserSevice {

    private UserMapper userMapper;
    public UserSeviceImpl( UserMapper userMapper){
        this.userMapper=userMapper;
    }

    @Override
    public User getRole(String mobile) {
        return userMapper.getRole(mobile);
    }
}