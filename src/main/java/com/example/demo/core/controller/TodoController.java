package com.example.demo.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    @GetMapping("/")
    public String showIndex() {
        return "Hello";
    }

    @GetMapping("/api")
    public String showAPIBase() {
        return "API Base";
    }
}
