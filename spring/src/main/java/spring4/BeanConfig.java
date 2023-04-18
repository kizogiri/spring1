package spring4;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "spring4")
public class BeanConfig {


    @Bean
    public Doctor4 doctor(){
        return new Doctor4();

    }


    @Bean
    public Nurse4 nurse(){
        return new Nurse4();

    }
}
