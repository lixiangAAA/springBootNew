package com.cbayel.springboot.serviceImpl;

import com.cbayel.springboot.mapper.SysUserMapper;
import com.cbayel.springboot.pojo.SysUser;
import com.cbayel.springboot.service.SysUserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper userMapper;//这里会报错，但是并不会影响

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return 0;
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public List<SysUser> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.findAllUser();
    }

    @Override
    public int insert(SysUser record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(SysUser record) {
        return 0;
    }

    @Override
    public SysUser selectByPrimaryKey(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return 0;
    }
}
