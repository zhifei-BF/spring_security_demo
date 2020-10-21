package com.liquor.spring_security_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Reference:
 * @Author: Liquor
 * @CreateDate:2020-10-21 14:05
 * @Modify:
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/hello")
    public String test(){
        return "hello security";
    }

}
