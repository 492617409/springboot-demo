package com.example.springbootdemo.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
@Log
public class HealthController {

    @GetMapping("/health")
    public String health(@RequestParam(name = "param",required = false) String param){
        log.info("参数:" + param);
        return "ok";
    }
}
