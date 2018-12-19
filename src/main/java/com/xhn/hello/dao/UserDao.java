package com.xhn.hello.dao;

import com.xhn.hello.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    @Autowired
    private SqlSession session;

    @Autowired
    private UserMapper userMapper;

    public User getUser(Integer userId)
    {
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getInfo(userId);

        User user2 = userMapper.selectByPrimaryKey(userId);
        return user2;
    }
}
