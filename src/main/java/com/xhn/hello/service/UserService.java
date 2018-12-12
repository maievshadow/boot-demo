package com.xhn.hello.service;

import com.xhn.hello.dao.User2Dao;
import com.xhn.hello.dao.UserDao;
import com.xhn.hello.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import java.lang.*;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private User2Dao user2Dao;

    public User getUser(Integer userId)
    {
        return userDao.getUser(userId);
    }

    public String userName()
    {
        return user2Dao.getAllUserInfo();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
