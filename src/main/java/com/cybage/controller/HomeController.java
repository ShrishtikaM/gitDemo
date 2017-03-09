package com.cybage.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 3/9/2017.
 */
@RestController
public class HomeController {
    public String home(){
        return "First Git Demo";
    }
}
