package com.example.lcc.service.impl;

import com.example.lcc.comm.Result;
import com.example.lcc.entity.SysMenu;
import com.example.lcc.entity.dto.SysMenuDto;
import com.example.lcc.entity.vo.SysMenuVo;
import com.example.lcc.mapper.SysMenuMapper;
import com.example.lcc.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author Licc
 * @date 2023/1/8 11:07 AM
 */
@Service
public class SysMenuServiceImpl   implements SysMenuService {
    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public SysMenu getAll(String id ) {
        return sysMenuMapper.getMenuAll(id);
    }

    @Override
    public Integer insertSysMenu(SysMenu sysMenu) {
        return sysMenuMapper.insertSysMenu(sysMenu);
    }

    @Override
    public List<SysMenuDto> SelectCacheMenus(String commId) {
        return sysMenuMapper.SelectCacheMenus(commId);
    }

    @Override
    public Result<List<SysMenuVo>> selectMultilist(String commId) {
        List<SysMenuVo> sysMenuVos = sysMenuMapper.selectMultilist(commId);
        if(CollectionUtils.isEmpty(sysMenuVos)){
            return   Result.error("集合为空");
        }
        return  Result.success(sysMenuVos);
    }


}