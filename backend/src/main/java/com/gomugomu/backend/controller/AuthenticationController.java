package com.gomugomu.backend.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v2/auth")
public class AuthenticationController {
    @PostMapping("/login")
    public HashMap login(){
        HashMap<String,Object> map = new HashMap<>();
        map.put("userId",123);
        map.put("token", "tokdfhasdf123");
        return map;
    }

    @PostMapping("/register")
    public HashMap register(){
        HashMap<String,Object> map = new HashMap<>();
        map.put("userId",123883);
        map.put("token", "tokdfhasdf123");
        return map;
    }
}
