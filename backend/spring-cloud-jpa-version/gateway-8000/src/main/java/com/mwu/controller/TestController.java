package com.mwu.controller;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("/gateway")
@RestController
public class TestController {

    @GetMapping("/t1")
    public Object hello() {
        return "Hello World! gateway-8000";
    }

    @GetMapping("/t2")
    public Object hello2() {
        return "Hello World! gateway-222222";
    }
}
