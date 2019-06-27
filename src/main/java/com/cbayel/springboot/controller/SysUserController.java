package com.cbayel.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cbayel.springboot.pojo.SysUser;
import com.cbayel.springboot.service.SysUserService;
import com.cbayel.springboot.util.LogUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService userService;
    Logger log = LogUtils.getExceptionLogger();
    Logger log1 = LogUtils.getBussinessLogger();
    Logger log2 = LogUtils.getDBLogger();

    @RequestMapping(value = "/add")
    public int addUser(SysUser user){
        return userService.insert(user);
    }

    @RequestMapping(value = "/findByPrimaryKey",method = RequestMethod.POST)
    public SysUser findByPrimaryKey(@RequestBody JSONObject data){
        SysUser object = new SysUser();
        SysUser sysUser = JSON.toJavaObject(data, SysUser.class);
        object = userService.selectByPrimaryKey(sysUser.getUserId());
        return object;

    }

//    @ResponseBody
    @RequestMapping(value = "/findAll/{pageNum}/{pageSize}")
    public List<SysUser> findAll(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        List<SysUser> userList = new ArrayList<SysUser>();
        userList = userService.findAllUser(pageNum,pageSize);
        return userList;

    }


}
