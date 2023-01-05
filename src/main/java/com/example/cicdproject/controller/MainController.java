package com.example.cicdproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "왜 안바뀌지?";
    }
}
