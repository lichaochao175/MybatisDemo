package com.example.lcc.mapper;

import com.example.lcc.entity.po.UserMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserMenu record);

    int insertSelective(UserMenu record);

    UserMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserMenu record);

    int updateByPrimaryKey(UserMenu record);

    List<UserMenu> getMenus(Long id);
}