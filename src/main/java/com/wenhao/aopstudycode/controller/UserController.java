package com.wenhao.aopstudycode.controller;

import com.wenhao.aopstudycode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/add")
    public void add(int i) {
        userService.add(i);
    }
}
