package day35_polymorphism.lessonQS.transportationTask;

import day34_abstraction.lessonQS.animalTask.Flyable;

public abstract class Plane extends Transportation implements Flyable { // plane is abstract class


    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    public void land(){
        System.out.println("Plane " + getMake() + " " + getModel() + " is landing");
    } // For all the plane , land() is same


    //If you think,  every single plane - land() is different , then it should be abstract.


    @Override
    public void fly() { // come from Flyable Interface
        System.out.println(getMake() + " " + getModel() + " is flying");
    }


}
/*
6. Create an abstract sub class of Transpotation named Plane that implements Flyable

				non-abstract method:
					land()
 */