package com.example.springplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringplaygroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringplaygroundApplication.class, args);
    }

}
