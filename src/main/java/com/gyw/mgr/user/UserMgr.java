package com.gyw.mgr.user;

import com.gyw.model.User;

/**
 * Created by Administrator on 2016/3/9.
 */
public interface UserMgr {

    public void queryAll();

    public void addUser(User user);

    public void updateUser(User user);

}
