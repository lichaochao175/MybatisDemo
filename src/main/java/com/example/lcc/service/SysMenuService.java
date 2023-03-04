package com.example.lcc.service;

import com.example.lcc.comm.Result;
import com.example.lcc.entity.SysMenu;
import com.example.lcc.entity.comm.CommId;
import com.example.lcc.entity.dto.SysMenuDto;
import com.example.lcc.entity.vo.SysMenuVo;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * @author Licc
 * @date 2023/1/8 11:07 AM
 */
public interface SysMenuService  {

     SysMenu getAll(String id);

     Integer insertSysMenu(SysMenu sysMenu);

     List<SysMenuDto> SelectCacheMenus(String commId);

     Result<List<SysMenuVo>> selectMultilist (@Param("id")String commId);
}