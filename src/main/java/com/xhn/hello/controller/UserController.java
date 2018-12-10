package com.xhn.hello.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
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

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("user_id", "1");
        params.put("name", "xx");

        JSONObject obj = new JSONObject();
        obj.put("name", "John");
        obj.put("nxx", userService.userName());
        obj.put("sex", "male");
        obj.put("age", 22);
        obj.put("is_student", true);
        obj.put("hobbies", new String[]{"hiking", "swimming"});

        obj.put("params", params);
        System.out.println(obj.toString());

        return obj.toString();
    }
}
