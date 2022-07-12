package day35_polymorphism.lessonQS.transportationTask;

public abstract class Car extends Transportation{ // Car is abstract class-generic class

    public Car(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }


    // we have inside this class 2 methods : transportPeople() and start()
    // by using abstract keyword inside Car class , we don´t need to override two methods from parent class, we can ignore it


    public void drive(){
        System.out.println("Driving " + getMake()+ " " + getModel());
    }

    // transportPeople() and start() : it can be also methods from Parent-Class can be overridden, if you think implementation is same for all the car, you can override it.


}
/*
5. Create an **** abstract *****   sub class of Transpotation named Car
				extra methods:
					drive()
 */
