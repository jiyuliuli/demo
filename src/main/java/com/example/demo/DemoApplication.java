package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {
    @Autowired
    private TestBean testBean;



    @RequestMapping("/")

    String aa() {
        return "is" + testBean.getAuthor()  + testBean.getName();

    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
