package spring2;

public class Doctor2 implements Staff2 {

  private String qualification;
  private int age;

    public Doctor2(String qualification, int age) {
        this.qualification = qualification;
        this.age = age;
    }


    public void assist(){
       System.out.println("Doctor is assisting patient");

    }





     //Getter setter

   public String getQualification() {
        return qualification;
    }

   /* public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    */

    public int getAge(){
        return age;
    }



}
