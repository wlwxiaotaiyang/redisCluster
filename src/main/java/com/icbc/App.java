package com.icbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.icbc.dao")
@EnableCaching
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
