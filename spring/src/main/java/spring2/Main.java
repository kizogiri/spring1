package spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

       // Doctor2 doctor= context.getBean(Doctor.class);
       // doctor.assist();



       // Nurse2 nurse= (Nurse)context.getBean("nurse");
       // nurse.assist();

        //Staff2 staff= context.getBean(Doctor.class);
        //staff.assist();

        //Staff2 staff= context.getBean(Nurse.class);
        //staff.assist();

        Doctor2 staff= context.getBean(Doctor2.class);
        staff.assist();
        System.out.println(staff.getQualification());
        System.out.println("tha age is :" + staff.getAge());


    }


}
