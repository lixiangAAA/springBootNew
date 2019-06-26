package com.cbayel.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2019/6/26 0026.
 */
@Controller
public class BaseController {
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
