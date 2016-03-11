package com.gyw.web;

import com.gyw.mgr.user.UserMgr;
import com.gyw.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
        List<User> users = userMgr.queryAll();
        String name="";
       if(users!=null&&users.size()>0){
           for(User user:users){
               System.out.println("###########################################");
               System.out.println(user.getName());
               name= user.getName();
           }
       }

        return name+"Hello "+username+",Your password is: "+password;

    }



}