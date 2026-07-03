package com.github.nw02.springsecsection1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity(jsr250Enabled = true, securedEnabled = true)
public class Springsecsection1Application {

    public static void main(String[] args) {
        SpringApplication.run(Springsecsection1Application.class, args);
    }

}
