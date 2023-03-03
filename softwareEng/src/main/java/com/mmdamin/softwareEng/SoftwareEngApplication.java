package com.mmdamin.softwareEng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SoftwareEngApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoftwareEngApplication.class, args);
    }

    @GetMapping("/")
    public String test() {
        return "is this working?";
    }
}
