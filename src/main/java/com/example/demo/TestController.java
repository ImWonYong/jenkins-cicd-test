package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String index() {
        return "Hello human";
    }

    @GetMapping("/test")
    public String test() {
        return "Test";
    }
}
