package com.manish.simpleWebApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
//    @GetMapping("/")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greet(){
        return "Welcome to Learning Spring & Spring Boot!!";
    }

    @GetMapping("/about")
    public String about(){
        return "Welcome about Page";
    }
}
