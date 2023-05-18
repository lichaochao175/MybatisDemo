package com.example.lcc.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.lcc.comm.Result;
import com.example.lcc.entity.SysMenu;
import com.example.lcc.entity.comm.CommId;
import com.example.lcc.entity.dto.SysMenuDto;
import com.example.lcc.entity.vo.SysMenuVo;
import com.example.lcc.mapper.SysMenuMapper;
import com.example.lcc.service.impl.SysMenuServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;


import java.util.List;


/**
 * @author Licc
 * @date 2023/1/8 11:06 AM
 */
@RestController
@RequestMapping("/sysmenu")
public class SysMenuController {
    private final Logger log = LoggerFactory.getLogger(SysMenuController.class);

    private RedisTemplate redisTemplate;

    private SysMenuServiceImpl sysMenuServiceImpl;

    private SysMenuMapper sysMenuMapper;

    @Autowired
    public SysMenuController(SysMenuServiceImpl sysMenuServiceImpl, SysMenuMapper sysMenuMapper,RedisTemplate redisTemplate) {
        this.sysMenuServiceImpl = sysMenuServiceImpl;
        this.redisTemplate = redisTemplate;
        this.sysMenuMapper = sysMenuMapper;
    }

    @GetMapping("/getAll")
    public SysMenu getAll() {
        return sysMenuServiceImpl.getAll("1");
    }

    @PostMapping("/insert")
    public Integer insertSysMenu(@RequestBody SysMenu sysMenu) {
        log.info("添加方法进入了！！！！");
        Integer integer = sysMenuServiceImpl.insertSysMenu(sysMenu);
        //获取新增后id的值
        log.info("接收到的ID:{}", sysMenu.getId());
        return integer;
    }

    @GetMapping("/getCach")
    public String  getCach( ) {
        return (String)redisTemplate.opsForValue().get("lcc");
    }

    @PostMapping("/cacheKeys")
    public void cacheKeys(@RequestParam  String id) {
        List<SysMenuDto> sysMenuDtos = sysMenuServiceImpl.SelectCacheMenus(id);
        JSONObject jsonObject = JSON.parseObject(sysMenuDtos.toString());
        redisTemplate.opsForValue()
                .set("sysMenuDtos", jsonObject);
    }

    /**
     * 测试redis是否联通
     */
    @GetMapping("/getRedis")
    public void getRedis() {
        List<SysMenuDto> sysMenuDtos = sysMenuServiceImpl.SelectCacheMenus("1");
        log.info("redis获取到的值：====>>>>>{}", redisTemplate.opsForValue().get("lcc"));
        log.info("redis获取存储的值：====>>>>>{}", redisTemplate.opsForValue().get("sysMenuDtos"));
        log.info("sysMenuDtos的值:{}", sysMenuDtos);

    }

    @GetMapping("/getLeftTable")
    public Result<List<SysMenuVo>> getTables(@RequestBody CommId commId) {
        return sysMenuServiceImpl.selectMultilist(commId.getId());
    }


}