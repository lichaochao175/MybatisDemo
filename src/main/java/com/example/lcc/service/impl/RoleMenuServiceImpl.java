package com.example.lcc.service.impl;

import com.example.lcc.entity.po.RoleMenu;
import com.example.lcc.entity.po.User;
import com.example.lcc.entity.po.UserRole;
import com.example.lcc.mapper.RoleMenuMapper;
import com.example.lcc.service.RoleMenuService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @author Licc
 * @date 2023/1/8 11:07 AM
 */
@Service
public class RoleMenuServiceImpl   implements RoleMenuService {
    private  RoleMenuMapper  roleMnuMapper;


    public RoleMenuServiceImpl( RoleMenuMapper  roleMnuMapper) {
        this.roleMnuMapper = roleMnuMapper;
    }


    @Override
    public List<RoleMenu> getRole(Long id) {
       return  roleMnuMapper.getRole(id);
    }


}