package com.cbayel.springboot.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SysProduct {
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productNum;

}