package com.sibro.consumerdemo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("service-provider")
public interface ProviderClient {

    @GetMapping("hello")
    public String hello();
}
