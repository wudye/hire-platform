package com.mwu.controller;

import com.mwu.GraceJSONResult;
import com.mwu.IMOOCJSONResult;
import com.mwu.pojo.test.Stu;
import com.mwu.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/u")
public class HellloController {
    @Autowired
    private StuService stuService;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/t1")
    public IMOOCJSONResult t1() {
        Stu stu = new Stu();
        stu.setName("imooc");
        stu.setAge(10);
        stuService.save(stu);
        return IMOOCJSONResult.ok("hello imooc");
    }

    @RequestMapping("/t2")
    public GraceJSONResult t2() {
        Stu stu = new Stu();
        stu.setName("mwu");
        stu.setAge(18);
        stuService.save(stu);
        return GraceJSONResult.ok("hello mwu");
    }


}
