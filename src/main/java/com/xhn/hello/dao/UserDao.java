package com.xhn.hello.dao;

import com.xhn.hello.mapper.UserMapper;
import com.xhn.hello.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    @Autowired
    private SqlSession sqlSession;

    public User getUserInfo(Integer userId) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //User user = mapper.getInfo(userId);

        User user = (User) sqlSession.selectOne("com.xhn.hello.mapper.UserMapper.getInfo", userId);
        return user;
    }
}
