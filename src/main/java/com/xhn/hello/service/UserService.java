package com.xhn.hello.service;

import com.xhn.hello.dao.UserDao;
import com.xhn.hello.mapper.UserMapper;
import com.xhn.hello.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import java.lang.*;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserDao userDao;

    public User getUser(Integer userId)
    {
        return userMapper.getInfo(userId);
    }

    public User getUser2(Integer userId)
    {
        return userDao.getUserInfo(userId);
    }


}
