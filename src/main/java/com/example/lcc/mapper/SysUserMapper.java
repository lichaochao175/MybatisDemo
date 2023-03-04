package com.example.lcc.mapper;

import com.example.lcc.entity.SysUser;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SysUserMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);



    SysUser selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}