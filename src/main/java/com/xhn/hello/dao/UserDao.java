package com.xhn.hello.dao;

import com.xhn.hello.mapper.UserMapper;
import com.xhn.hello.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    @Autowired
    private SqlSession session;

    public User getUser(Integer userId)
    {
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getInfo(userId);
        User user2 = mapper.selectByPrimaryKey(userId);
        return user;
    }
}
