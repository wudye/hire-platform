package com.mwu.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/g")
public class HellloController {


    @RequestMapping("/hello")
    public String hello() {
        return "Hello World! this is gateway service";
    }




}
