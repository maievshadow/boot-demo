package com.xhn.hello.mapper;

import com.xhn.hello.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM card_user WHERE user_id = #{userId}")
    User getInfo(@Param("userId") Integer userId);
}