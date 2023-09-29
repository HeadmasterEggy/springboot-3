package com.example;

import com.example.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Main.class, args);
        String[] names = ioc.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }

        Person person = ioc.getBean(Person.class);
        System.out.println("person: " + person);
    }
}
