package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloJavaController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String home() {
        System.out.println("home controller start");

        return "hello";
    }
}
