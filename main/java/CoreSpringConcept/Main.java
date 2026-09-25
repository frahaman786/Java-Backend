package CoreSpringConcept;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        /* Spring creates a container and use AppConfig.class as my configuration and read at
        this point spring satart doing a lot of work container will store evertyhing u need */
        AppInfo appInfo = context.getBean(AppInfo.class);
        /* getBean() Spring give me the Appinfo Bean that you created, Spring Search it container
        * return the object now points to the same AppInfo object managed by spring*/
        appInfo.showInfo();
        //then appInfo.show.. execute
        context.close();
    }
}
