package com.gyw.web;

import com.gyw.mgr.user.UserMgr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TODO 控制层代码
 */
@Controller
public class MyController {

    @Autowired
    private UserMgr userMgr;

    @RequestMapping("login") //用来处理前台的login请求
    private @ResponseBody String hello(
            @RequestParam(value = "username", required = false)String username,
            @RequestParam(value = "password", required = false)String password
    ){
        userMgr.queryAll();
        return "Hello "+username+",Your password is: "+password;

    }



}