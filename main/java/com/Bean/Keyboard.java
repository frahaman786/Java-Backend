package com.Bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Keyboard {

    public Keyboard() {
        System.out.println("Keyboard constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("Keyboard initialization");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Keyboard cleanup");
    }

    public void press() {
        System.out.println("Keyboard is pressing");
    }
}