package spring6Custom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig6 {


    @Bean
    public Doctor6 doctor(){
        return new Doctor6();
    }
}
