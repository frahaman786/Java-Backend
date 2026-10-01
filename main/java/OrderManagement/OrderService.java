package OrderManagement;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public String CreateOrder(){
        System.out.println("Creating order.....");
        return "Order Created Successfully";
    }
    public String CreateFaileOrder(){
        System.out.println("Creating Order....");
        throw new RuntimeException("Payment failed");
    }


}
