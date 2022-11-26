package com.example.sample1.controller;

import com.example.sample1.pojo.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestConroller {
    @GetMapping(path = "/test")
    public Users GetUsers(){
        var user=new Users();
        user.setUsername("123");
        user.setPassword("123");
        // get current datetime
        user.setBirthday(new Date());
        return user;
    }
}
