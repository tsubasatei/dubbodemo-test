package com.xt.dubbodemo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xt.dubbodemo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("/getName")
    public String getName() {
        System.out.println("UserController...getName...");
        return userService.getName();
    }
}
