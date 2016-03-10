package com.gyw.dao.user;

import com.gyw.model.User;

/**
 * Created by Administrator on 2016/3/9.
 */
public class UserDaoImpl implements UserDao {
    public void queryAll(){
        System.out.println("query all user sucess...");
    }

    public void addUser(User user){
        System.out.println("add user"+user.getName()+" :sucess...");
    }

    public void updateUser(User user){
        System.out.println("update user"+user.getName()+":sucess...");
    }
}
