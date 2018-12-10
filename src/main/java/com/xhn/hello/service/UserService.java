package com.xhn.hello.service;

import org.springframework.stereotype.*;

import java.lang.*;

@Service
public class UserService {

    private String name;

    public UserService() {
    }

    public String userName()
    {
        return "maiev";
    }
}
