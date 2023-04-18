package spring3;

import org.springframework.stereotype.Component;

@Component
public class Nurse3 implements Staff3 {


    public void assist() {
        System.out.println("Nurse is assisting");
    }


}
