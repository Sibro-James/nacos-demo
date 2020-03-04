package com.sibro.providerdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Value("${myName}")
    private String myName;

    @GetMapping("hello")
    public String hello(){
        return "Hello "+myName;
    }
}
