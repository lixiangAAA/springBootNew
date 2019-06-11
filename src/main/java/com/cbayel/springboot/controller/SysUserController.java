package com.cbayel.springboot.controller;

import com.cbayel.springboot.pojo.SysUser;
import com.cbayel.springboot.service.SysUserService;
import com.cbayel.springboot.util.LogUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService userService;
    Logger log = LogUtils.getExceptionLogger();
    Logger log1 = LogUtils.getBussinessLogger();
    Logger log2 = LogUtils.getDBLogger();
    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(SysUser user){
        return userService.insert(user);
    }

    @ResponseBody
    @RequestMapping(value = "/findByPrimaryKey", produces = {"application/json;charset=UTF-8"})
    public SysUser findByPrimaryKey(SysUser user){
        SysUser object = new SysUser();
        object = userService.selectByPrimaryKey(user.getUserId());
        return object;

    }

    @ResponseBody
    @RequestMapping(value = "/findAll/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public List<SysUser> findAll(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        List<SysUser> userList = new ArrayList<SysUser>();
        userList = userService.findAllUser(pageNum,pageSize);
        return userList;

    }


}
