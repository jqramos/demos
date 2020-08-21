package com.example.control.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "com.example.control.web",
                "com.example.data",
                "com.example.web"
        }
)
public class WebApplication {
  public static void main(String[] args) {
    SpringApplication.run(WebApplication.class, args);
  }

}
