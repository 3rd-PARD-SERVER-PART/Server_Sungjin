package com.pard.hw1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello.html";
    }
}

