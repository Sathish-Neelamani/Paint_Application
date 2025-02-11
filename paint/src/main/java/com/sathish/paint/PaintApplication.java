package com.sathish.paint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaintApplication {

    public static void main(String[] args) {
        System.out.println("Inside my start-up business application");
        SpringApplication.run(PaintApplication.class, args);
    }

}
