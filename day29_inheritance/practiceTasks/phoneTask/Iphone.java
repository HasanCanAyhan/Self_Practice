package day29_inheritance.practiceTasks.phoneTask;

public class Iphone extends Phone{

    public void faceTime(long phoneNumber){
        System.out.println(getBrand() + " - " + getModel() + " is face timing with " + phoneNumber );
    }

    public void faceTime(String email){
        System.out.println(getBrand() + " - " + getModel() + " is face timing with " + email );
    }


}
