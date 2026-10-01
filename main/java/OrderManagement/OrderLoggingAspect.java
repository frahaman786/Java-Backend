package OrderManagement;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;

@Aspect
@Component
public class OrderLoggingAspect {

    @Before("execution(* OrderManagement.OrderService.CreateOrder(..))")
    public void beforeCreateOrder(){
        System.out.println("LOG: Order creation is starting");
    }
    @After("execution(* OrderManagement.OrderService.CreateOrder(..))")
    public void afterCreateOrder(){
        System.out.println("LOG: Order Creation process finished..");
    }
    @AfterReturning(
            pointcut = "execution(* OrderManagement.OrderService.CreateOrder(..))",
            returning = "result"
    )
    public void afterCreateOrderSuccessfully(Object result){
        System.out.println("LOG: Order completed successfully");
        System.out.println("LOG: Result = " + result);
    }
    @AfterThrowing(
            pointcut = "execution(* OrderManagement.OrderService.CreateFailOrder(..))",
            throwing = "exception"
    )
    public void orderFailed(Exception exception){
        System.out.println("LOG: Order creation failed");
        System.out.println("LOG: Error = " + exception.getMessage());
    }


}
