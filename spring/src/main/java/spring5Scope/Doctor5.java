package spring5Scope;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Doctor5 {

    @Override
    public String toString() {
        return "Doctor5{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    private String qualification;

    public void assist() {
        System.out.println("The Doctor is assisting");
    }


    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
