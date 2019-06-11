package com.cbayel.springboot.mapper;

import com.cbayel.springboot.pojo.SysProduct;

public interface SysProductMapper {
    int insert(SysProduct record);

    int insertSelective(SysProduct record);
}