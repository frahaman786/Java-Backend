package com.myapp;

import org.springframework.stereotype.Component;
@Component
public class Computer {

    private Keyboard key;
    Computer(Keyboard key){
        this.key = key;
    }
    public void type(){
        key.press();
        System.out.println("Computer is Typing....");
    }

}
