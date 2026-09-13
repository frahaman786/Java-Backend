package DI_Prac;

public class Computer {
    private Keyboard key;
    Computer(Keyboard key){
        this.key = key;
    }
    void type(){
        key.press();
        System.out.println("Keybord is pressing");
    }
}
