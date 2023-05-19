package com.example.lcc.mapper;

import com.example.lcc.entity.po.RoleMenu;
import com.example.lcc.entity.po.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoleMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RoleMenu record);

    int insertSelective(RoleMenu record);

    RoleMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleMenu record);

    int updateByPrimaryKey(RoleMenu record);


    /**
     * 根据角色 返回所有菜单id
     * @param id
     * @return
     */
    List<RoleMenu> getRole(Long id);


}