package com.example.boottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //이 어노테이션이 있는 클래스를 메인클래스라고 생각하면 된다.
public class BoottestApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoottestApplication.class, args);
    }

}
