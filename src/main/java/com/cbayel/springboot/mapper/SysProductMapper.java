package com.cbayel.springboot.mapper;

import com.cbayel.springboot.pojo.SysProduct;
import org.springframework.stereotype.Repository;

@Repository
public interface SysProductMapper {
    int insert(SysProduct record);

    int insertSelective(SysProduct record);
}