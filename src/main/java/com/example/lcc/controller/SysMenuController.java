package com.example.lcc.controller;


import com.example.lcc.comm.Result;
import com.example.lcc.entity.SysMenu;
import com.example.lcc.entity.comm.CommId;
import com.example.lcc.entity.dto.SysMenuDto;
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
     private final Logger log =  LoggerFactory.getLogger(SysMenuController.class);
    private RedisTemplate redisTemplate;
    private SysMenuServiceImpl  sysMenuServiceImpl;

    private SysMenuMapper sysMenuMapper;

    @Autowired
    public SysMenuController(SysMenuServiceImpl  sysMenuServiceImpl ,RedisTemplate redisTemplate,SysMenuMapper sysMenuMapper){
          this.sysMenuServiceImpl = sysMenuServiceImpl;
          this.redisTemplate= redisTemplate;
          this.sysMenuMapper=sysMenuMapper;
    }

    @GetMapping("/getAll")
    public SysMenu getAll(){
       System.out.println("方法进入了！！！！");
       return  sysMenuServiceImpl.getAll("1") ;
    }
    @PostMapping("/insert")
    public Integer insertSysMenu(@RequestBody SysMenu sysMenu){
        System.out.println("添加方法进入了！！！！");
        Integer integer = sysMenuServiceImpl.insertSysMenu(sysMenu);
        //获取新增后id的值
        System.out.println("接收到的ID："+sysMenu.getId());

        return  integer ;
    }

    @PostMapping("/cacheKeys")
    public void cacheKeys( @RequestBody  String  id ){
        List<SysMenuDto> sysMenuDtos = sysMenuServiceImpl.SelectCacheMenus(id);
        redisTemplate.opsForValue()
                .set("sysMenuDtos",sysMenuDtos);

        redisTemplate.opsForValue()
                .set("lcc",sysMenuDtos);
    }

    /**
     * 测试redis是否联通
     */
    @GetMapping("/getRedis")
    public void  getRedis()
    {
        List<SysMenuDto> sysMenuDtos = sysMenuServiceImpl.SelectCacheMenus("1");
        log.info("redis获取到的值：====>>>>>" +redisTemplate.opsForValue().get("lcc"));
        log.info("redis获取存储的值：====>>>>>" +redisTemplate.opsForValue().get("sysMenuDtos"));
//        log.info("redis获取所有key：=======>>>>>"+redisTemplate);

    }

    @GetMapping("/getLeftTable")
    public Result getTables( @RequestBody  CommId  commId )
    {
        return sysMenuServiceImpl.selectMultilist(commId.getId());
    }



}