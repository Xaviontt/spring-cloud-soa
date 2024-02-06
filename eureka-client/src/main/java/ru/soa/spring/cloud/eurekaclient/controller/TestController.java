package ru.soa.spring.cloud.eurekaclient.controller;

import jakarta.ws.rs.GET;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from eureka client";
    }
}
