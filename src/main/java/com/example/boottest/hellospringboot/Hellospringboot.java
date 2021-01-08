package com.example.boottest.hellospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellospringboot {

    @GetMapping("/test")
    public String hello(){
        return "Hello Springboot!";
    }
}
