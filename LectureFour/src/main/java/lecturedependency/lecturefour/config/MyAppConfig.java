package lecturedependency.lecturefour.config;

import lecturedependency.lecturefour.Service.Cities;
import lecturedependency.lecturefour.Service.Database;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

    @Bean
    public Database database(){
        return new Database();
    }
    @Bean
    public Cities cities(){
        return new Cities("ENG");
    }
}
