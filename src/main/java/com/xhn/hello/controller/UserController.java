package com.xhn.hello.controller;

import com.xhn.hello.config.AuthorConfig;
import jdk.nashorn.internal.objects.annotations.Property;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import com.xhn.hello.service.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthorConfig authorConfig;

    @Autowired
    private Environment environment;

    @RequestMapping("index")
    String index() {

        Map<String, Object> params = new HashMap<String, Object>();

        Map<String, Object> author = new HashMap<String, Object>();
        author.put("name", authorConfig.getName());
        author.put("age", authorConfig.getAge());

        JSONObject obj = new JSONObject();

        /*
        obj.put("name", "John");
        obj.put("nxx", userService.userName());
        obj.put("sex", "male");
        obj.put("age", 22);
        obj.put("is_student", true);
        obj.put("hobbies", new String[]{"hiking", "swimming"});
        */

        obj.put("author", author);
        obj.put("msg", environment.getProperty("test.msg"));

        obj.put("user", userService.getUser(new Integer(2)));

        System.out.println(obj.toString());

        return obj.toString();
    }
}
