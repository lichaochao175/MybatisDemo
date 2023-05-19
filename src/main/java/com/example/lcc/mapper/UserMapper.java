package com.example.lcc.mapper;

import com.example.lcc.entity.po.RoleMenu;
import com.example.lcc.entity.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    User getRole(String mobile);
}