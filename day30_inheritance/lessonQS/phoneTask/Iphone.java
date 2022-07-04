package day30_inheritance.lessonQS.phoneTask;

public class Iphone extends Phone{ // Iphone Is A Phone

    public Iphone(String model, String size, String color, double price){// analyse which argument is unnecessary
        // this() // using within the same class-current class
        super("Apple", model, size, color, price);// Apple is brand of  all  the iphone object, we know already it - we have to pass the parameters of  parent constructor( 5 parameters) into super(...)
        // super : it must call the constructor of parent class(super class)
    }


    public static boolean hasApplePay = true;

    public void faceTime(long phoneNumber){
        System.out.println(getModel() + " is face timing with " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(getModel() + " is face timing with " + email);
    }


}
/*
2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)
 */
