package com.example.lcc.mapper;

import com.example.lcc.entity.SysMenu;

import com.example.lcc.entity.dto.SysMenuDto;
import com.example.lcc.entity.vo.SysMenuVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface SysMenuMapper {
     SysMenu getMenuAll(@Param("id")String id);


     Integer insertSysMenu(SysMenu sysMenu);

     List<SysMenuDto> SelectCacheMenus(@Param("id")String commId);

     List<SysMenuVo>  selectMultilist (@Param("id")String commId);


     


}