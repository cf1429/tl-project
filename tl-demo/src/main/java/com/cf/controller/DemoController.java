package com.cf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:chenf
 * @Date:2021/8/16 18:28
 * @describe
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController {
    @RequestMapping(value = "/test")
    public String test(){
        return "测试成功";
    }
}
