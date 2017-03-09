package com.cybage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 3/9/2017.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "First Git Demo";
    }

    @RequestMapping("/createUser")
    public String createUser(){
        return "User is created";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(){
        return "User deleted";
    }
}
