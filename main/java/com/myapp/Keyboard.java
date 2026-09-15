package com.myapp;
import org.springframework.stereotype.Component;

//Spring, I want you to manage an object of this class.
//this telling by using import and @Component
@Component
public class Keyboard {
    public void press(){
        System.out.print("Presssing.....");
    }
}
