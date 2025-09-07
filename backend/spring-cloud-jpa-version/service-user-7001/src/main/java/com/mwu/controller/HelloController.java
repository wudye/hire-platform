package com.mwu.controller;

import com.mwu.entity.Stu;
import com.mwu.service.StuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/u")
@RequiredArgsConstructor
public class HelloController {
    private final StuService stuService;

    @RequestMapping("/t1")
    public Object hello() {
        return "Hello World! company-7001 change for user";
    }


    @RequestMapping("/t2")
    public Object hello2() {
        Stu stu = new Stu();
        stu.setName("mwu");
        stu.setAge(18);
//        stu.setId(1003);
//        stu.setVersion(0);
        stuService.saveStu(stu);


        return "student saved" + stu;
    }
}
