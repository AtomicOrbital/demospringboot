package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demospringboot.dto.User;
@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("")
    public User demo(){
        User user = new User();
        user.setId(1);
        user.setFullName("Nguyễn Văn A");
        user.setAge(21);

        return user;
    }


}
