package com.example.demo.controller;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserContoller {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserById")
    @ResponseBody
    public UserModel getUserById(@RequestParam(value = "id") Integer id){
        return userService.getUserById(id);
    }

}
