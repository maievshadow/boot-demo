package com.xhn.hello.controller;

import com.xhn.hello.pojo.User;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import com.xhn.hello.service.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("index")
    String index() {

        JSONObject obj = new JSONObject();

        User user = userService.getUser(new Integer(2));
        User user2 = userService.getUser2(new Integer(2));

        obj.put("user", user.toString());
        obj.put("user2", user2.toString());

        System.out.println(obj.toString());

        return obj.toString();
    }
}
