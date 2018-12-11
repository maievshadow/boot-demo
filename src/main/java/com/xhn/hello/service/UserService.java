package com.xhn.hello.service;

import com.xhn.hello.dao.UserDao;
import com.xhn.hello.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import java.lang.*;

@Service
public class UserService {

    private UserDao userDao;

    public User getUser(Integer userId)
    {
        return userDao.getUser(userId);
        //return userDao.getName();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
