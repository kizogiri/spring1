package spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context=
                new ClassPathXmlApplicationContext("springdemo3.xml");

        Staff3 staff = context.getBean(Doctor3.class);
        staff.assist();



    }
}
