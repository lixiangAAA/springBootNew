package com.cbayel.springboot.service;

import com.cbayel.springboot.pojo.SysUser;

import java.util.List;

public interface SysUserService {
    int deleteByPrimaryKey(Integer userId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    List<SysUser> findAllUser(int pageNum, int pageSize);
}
