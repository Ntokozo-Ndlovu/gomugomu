package com.gomugomu.backend.controller;

import com.gomugomu.backend.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v2/")
public class UserController {
    @GetMapping("/user")
    public HashMap getUser(){
        User user = new User();
        HashMap map = new HashMap();
        map.put("data", user);
        return map;
    }

    @PatchMapping("/user")
    public HashMap updateUser(){
        User user = new User();
        HashMap map = new HashMap();
        map.put("data", user);
        return map;
    }
}
