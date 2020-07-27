package com.liang.service.impl;

import com.liang.dao.UserDao;
import com.liang.model.UserEntity;
import com.liang.service.UserService;

/**
 * @Author
 * @Date
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserEntity getUser(int id) {
        UserEntity userEntity = new UserEntity();
        return userEntity;
    }
}
