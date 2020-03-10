package com.homework.firstwork;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.homework.firstwork.mapper")
public class FirstworkApplication {
    public static void main(String[] args) {
        SpringApplication.run(FirstworkApplication.class, args);
    }
}
