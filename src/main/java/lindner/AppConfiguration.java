package lindner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class AppConfiguration {

    /*@Bean(name = "applicationName")
    public String applicationName(){
        return "Sales System";
    }*/

    @Bean
    public CommandLineRunner execute(){
        return args -> {
            System.out.println("Testou testando");
        };
    }
}
