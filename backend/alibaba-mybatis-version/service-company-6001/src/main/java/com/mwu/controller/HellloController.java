package com.mwu.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/c")
public class HellloController {


    @RequestMapping("/hello")
    public String hello() {
        return "Hello World! this is company service";
    }




}
