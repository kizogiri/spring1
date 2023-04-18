package spring5Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {


        ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfig5.class);

        Doctor5 doctor= context.getBean(Doctor5.class);
        doctor.assist();
        doctor.setQualification("MBBS");
        System.out.println(doctor);

        Doctor5 doctor1 = context.getBean(Doctor5.class);
        //doctor1.setQualification("MD");
        System.out.println(doctor1);
    }
}
