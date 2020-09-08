package com.cbayel.springboot.pojo;

import lombok.Data;

@Data
public class SysUser {
    private Integer userId;

    private String userName;

    private String password;

    private String phone;

}