package com.xhn.hello.dao;

import com.xhn.hello.mapper.UserMapper;
import com.xhn.hello.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDao {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public User getUser(Integer userId)
    {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper mapper = session.getMapper(UserMapper.class);
            User user = mapper.selectByPrimaryKey(userId);
            return user;
        } finally {
            session.close();
        }
    }
}
