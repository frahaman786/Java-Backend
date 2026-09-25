package CoreSpringConcept;

public class ServiceB {
    private ServiceA serviceA;

    public ServiceB(){
        System.out.println("ServiceB created");
    }

    public void setServiceB(ServiceA serviceA){
        this.serviceA = serviceA;
        System.out.println("ServiceA injected into  ServiceB");

    }
}
