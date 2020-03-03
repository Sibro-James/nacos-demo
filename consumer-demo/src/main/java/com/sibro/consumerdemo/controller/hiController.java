package com.sibro.consumerdemo.controller;

import com.sibro.consumerdemo.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hiController {

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("hi")
    public String hi(){
        return "hi consumer ============"+providerClient.hello();
    }
}
