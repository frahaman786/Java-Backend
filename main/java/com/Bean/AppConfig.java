package com.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Keyboard keyboard() {
        return new Keyboard();
    }

    @Bean
    public Computer computer(Keyboard keyboard){
        return new Computer(keyboard);
    }
}