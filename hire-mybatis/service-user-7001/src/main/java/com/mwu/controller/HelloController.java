package com.mwu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("u")
@Slf4j
public class HelloController {


    @GetMapping
    public Object hello() {

        log.info("Hello World 70001");
        return "Hello World 70001";
    }
}
