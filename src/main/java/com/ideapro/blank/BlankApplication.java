package com.ideapro.blank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class BlankApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlankApplication.class, args);
    }
}
