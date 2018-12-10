package com.xhn.hello;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.*;

@SpringBootApplication
@ComponentScan("com.xhn.hello.controller.*")
@ComponentScan("com.xhn.hello.service.*")
@EnableAutoConfiguration
public class Hello{
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Hello.class, args);
    }

}
