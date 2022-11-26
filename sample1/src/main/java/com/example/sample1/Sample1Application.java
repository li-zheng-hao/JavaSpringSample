package com.example.sample1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sample1Application {

    public static void main(String[] args) {
        var context=SpringApplication.run(Sample1Application.class, args);
        var names=context.getBeanDefinitionNames();
        for (String name : names) {
            if(name.toLowerCase().contains("book"))
                System.out.println(name);
        }
    }

}
