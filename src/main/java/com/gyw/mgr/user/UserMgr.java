package com.gyw.mgr.user;

import com.gyw.model.User;

import java.util.List;

/**
 * Created by Administrator on 2016/3/9.
 */
public interface UserMgr {

    public List<User> queryAll();

    public void addUser(User user);

    public void updateUser(User user);

}
