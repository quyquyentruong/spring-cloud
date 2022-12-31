package com.example.helloexample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class SecondController {
    @GetMapping("/message")
    public String test() {
        return "Hello JavaInUse Called in First Service";
    }
}
