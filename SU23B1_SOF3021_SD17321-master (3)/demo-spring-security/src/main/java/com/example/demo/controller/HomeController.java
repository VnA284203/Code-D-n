package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    public String home() {
        return "hello world";
    }
}
