package com.cbayel.springboot.controller;

import com.cbayel.springboot.pojo.SysUser;
import com.cbayel.springboot.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/sysUser")
public class SysUserController {

    private final SysUserService userService;
    //Logger log = LogUtils.getExceptionLogger();
    //Logger log1 = LogUtils.getBussinessLogger();
    //Logger log2 = LogUtils.getDBLogger();

    @Autowired
    public SysUserController(SysUserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/add")
    public int addUser(SysUser user){
        return userService.insert(user);
    }

    @RequestMapping(value = "/findByPrimaryKey",method = RequestMethod.POST)
    public SysUser findByPrimaryKey(@RequestBody SysUser data){
        SysUser object = new SysUser();
        //SysUser sysUser = JSON.toJavaObject(data, SysUser.class);
        //object = userService.selectByPrimaryKey(Integerdata.get("userId").getClass());
        return data;

    }

    @RequestMapping(value = "/findAll/{pageNum}/{pageSize}")
    public List<SysUser> findAll(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        List<SysUser> sysUsers = userService.findAllUser(pageNum,pageSize);
        return sysUsers;

    }


}
