package com.example.cicdproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "변경되라...진짜..";
    }
}
