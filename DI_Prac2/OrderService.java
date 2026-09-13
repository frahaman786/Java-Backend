package DI_Prac2;

public class OrderService {
    private  Notification nt;
    OrderService(Notification nt){
        this.nt = nt;
    }
    void placeHoolder(){
        nt.SendNotificiation();
        System.out.println("Order Placed");
    }

}
