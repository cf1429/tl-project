package com.cf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:chenf
 * @Date:2021/8/16 18:23
 * @describe
 */
@RestController
public class LoginController {
    @RequestMapping(value = "/login")
    public String login(){
        return "登录成功";
    }
}
