package com.mwu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/c")
public class HelloController {

    @RequestMapping("/t1")
    public Object hello() {
        return "Hello World! company-6001 this is a change for company test devtool";
    }
}
