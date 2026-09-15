package com.myapp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.myapp");
        Computer computer = context.getBean(Computer.class);
        computer.type();
    }

}
