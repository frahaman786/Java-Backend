package com.Bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        //Spring Start Ioc container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Computer computer = context.getBean(Computer.class);

        computer.type();
    }
}