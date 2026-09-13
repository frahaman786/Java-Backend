package DI_Prac2;

public class Main {
    public static void main(String[] args) {
        Notification nt = new Notification();
        OrderService sd = new OrderService(nt);
        sd.placeHoolder();
    }
}
