package CoreSpringConcept;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;


/*Now it comes to appInfo and works*/
public class AppInfo {
    /* @Value("${app.name}")
    private String appName; */

    /* @Value("${app.version}")
    private String version; */

    private Environment environment;

    public AppInfo(Environment environment){
        this.environment = environment;
    }



    public void showInfo(){
        // System.out.println("Application: "+ appName);
        // System.out.println("Version:"+ version);
        String appName = environment.getProperty("app.name");
        String version = environment.getProperty("app.version");
        String owner = environment.getProperty("app.owner");

        System.out.println("Application: "+ appName);
        System.out.println("version: "+ version);
        System.out.println("Owner: " + owner);

    }
}
