package CoreSpringConcept;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


/* 1. comes to config, Spring sees @Conf.. this class containing spring configuration */
@Configuration
/*2. Spring sees @Prop.. spring loads properties these property are now available through Spring
* Environment */
@PropertySource("classpath:application.properties")
public class AppConfig{

    /*3. Spring looks at the @Bean method and create a bin */
    @Bean
    public ServiceA serviceA() {
        return new ServiceA();
    }
    //same
    @Bean
    public ServiceB serviceB() {
        return new ServiceB();
    }

    /* This is where dependency injection happens Spring ses 2 method
    * required serviceA and serviceB Spring already has both then work as their instruction*/
    @Bean
    public Object connectService(ServiceA serviceA, ServiceB serviceB){
        serviceA.setServiceB(serviceB);
        serviceB.setServiceB(serviceA);
        return new Object();
    }
    /*Now came to this, this method require an environment object i have one, so ill inject it*/
    @Bean
    public AppInfo appInfo(Environment environment){
        //Now AppInfo object now contains a reference to spring environment
        return new AppInfo(environment);
        //it goes to AppInfo
    }
}