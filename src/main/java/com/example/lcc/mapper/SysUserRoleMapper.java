package com.example.lcc.mapper;

import com.example.lcc.entity.SysUserRole;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SysUserRoleMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);


    SysUserRole selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}