package com.xhn.hello.dao;

import com.xhn.hello.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class User2Dao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String getAllUserInfo(){

        String result = "";
        SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet("Select * from card_user;");
        while (sqlRowSet.next()){
            result += "UserName: "+sqlRowSet.getString("mobile") + "\r\n";
        }

        return result;
    }
}
