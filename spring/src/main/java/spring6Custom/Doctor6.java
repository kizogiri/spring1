package spring6Custom;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Configuration;


public class Doctor6 implements BeanNameAware {

    void assist(){
        System.out.println("the Doctor is assisting");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanAware method is called");

    }

    @PostConstruct
     void postConstruct(){
        System.out.println("PostConstruct method is called ");
    }
}
