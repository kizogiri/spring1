package spring3;


import org.springframework.stereotype.Component;

@Component
public class Doctor3 implements Staff3 {




    public void assist(){
        System.out.println("Doctor is assisting");
    }
}
