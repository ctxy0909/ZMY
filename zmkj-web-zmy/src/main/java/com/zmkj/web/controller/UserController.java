package com.zmkj.web.controller;


import com.zmkj.dto.User;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/me")
public Object getCurrentUser(Authentication authentication){
        return authentication;
    }
    @PostMapping
    public User create(@RequestBody User user) {

        System.out.println(user.getId());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());

        user.setId("1");
        return user;
    }


}