package com.vt.hacks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "com.vt.hacks.service")
public class VtHacksApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(VtHacksApplication.class, args);
    }
}
