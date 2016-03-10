package com.gyw.mgr.user;

import com.gyw.dao.user.UserDao;
import com.gyw.model.User;

/**
 * Created by Administrator on 2016/3/9.
 */
public class UserMgrImpl implements UserMgr {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void queryAll(){
     userDao.queryAll();
    }

    public void addUser(User user){
        userDao.addUser(user);
    }

    public void updateUser(User user){
      userDao.updateUser(user);
    }
}
