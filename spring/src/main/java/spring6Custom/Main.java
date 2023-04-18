package spring6Custom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {


        ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfig6.class);

        Doctor6 doctor= context.getBean(Doctor6.class);
        doctor.assist();




    }
}
