package day26_statics.lessonQS;

public class Iphone {

     /*
    -Declared with static keyword
    -Belongs to the class, and can be called through the class
    -There is only one copy of the static for all objects of the class
    -All the Objects of the class shares the same copy
     */

    /*
    Static Variables

    -Refer to the common property of all objects
    -It gets memory only once in the class area at the time of class loading
    -A single copy of a class´s static variable is shared by all objects of the class
    -If changes are made to static variables,all other instances will see the effect of the change
     */

    /*
     Static Methods

     -A method that can be called using class name, without creating objects
     -Objects can also call static members
     -Static methods only accept static members, not accept instances

     */


    public static String brand = "Apple"; //static: "Apple" is the brand of all the iphone objects

    public String model; // instance : different models for iphone objects

    public String color;

    public double price;

    public static String OS = "iOS"; // static: operating system is same for all the iphone objects

    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean isExpensiveToFix = true;

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }


    /*
    public static void printPhoneInfo(){ // static only accepts statics, NOT instance
        //System.out.println("Model: "+ model); --->> it is intances variable
        //System.out.println("Color: "+ color); --->> it is also instance variable
    }
     */

    public void printIphoneInfo(){ //instance through the object // intance methods accepts both static and none static
        System.out.println("Brand: " + brand); // it is static , but intance methods share inside Class so (class members)
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);

    }

    public static void printOperatingSystem(){ //inside the static methods  we can not use instance variable
        System.out.println("OperatingSystem: " + OS);
    }


}
/*
Attributes:
    brand, model, color, price, OS, madeIn, hasBattery, isTouchScreen, isExpensiveToFix
 */