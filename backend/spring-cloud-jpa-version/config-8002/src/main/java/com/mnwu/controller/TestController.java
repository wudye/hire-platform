package com.mnwu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/encrypt")
@RestController
public class TestController {
    @GetMapping("/t1")
    public Object t1() {
        return "Hello World! config-8002";
    }


}
