package com.example.lcc.mapper;

import com.example.lcc.entity.SysUser;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface SysUserMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);



    SysUser selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}