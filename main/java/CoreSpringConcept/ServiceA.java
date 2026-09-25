package CoreSpringConcept;

public class ServiceA {
    private ServiceB serviceB;
    public ServiceA(){
        System.out.println("ServiceA Created");
    }
    public void setServiceB(ServiceB serviceB){
        this.serviceB = serviceB;
        System.out.print("ServiceA is Created");

    }

}
