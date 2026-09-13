package DI_Prac;

public class Main {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        Computer computer = new Computer(keyboard);
        computer.type();

    }
}
