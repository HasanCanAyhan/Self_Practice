package day27_accessModifiers.practiceTasks;

public class Iphone { // Task 1

    public String model,color;
    public double size;
    public double price;
    public  String designedIn;


    public static String brand;
    public static String OS;
    public static boolean isSmartPhone;
    public static String madeIn;


    public Iphone(String model, String color, double size, double price, String designedIn) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
        this.designedIn = designedIn;
    }

    static {
        brand = "Apple";
        OS = "iOS";
        isSmartPhone = true;
        madeIn = "China";

    }

    public static void printOperatingSystem(){
        System.out.println("OS = " + OS);
    }

    public void call(long phoneNumber){

        System.out.println("...calling  " + phoneNumber);

    }

    public void text(long phoneNumber){
        System.out.println("...texting  " + phoneNumber );
    }

    public void faceTime(long phoneNumber){

        System.out.println("...face timing  " + phoneNumber);

    }

    public void faceTime(String email){
        System.out.println("... face timing  " + email);
    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", designedIn='" + designedIn + '\'' +
                '}';
    }
}
/*
1. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */