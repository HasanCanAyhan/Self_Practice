package day35_polymorphism.lessonQS.transportationTask;

import day34_abstraction.lessonQS.animalTask.Flyable;
import day34_abstraction.lessonQS.animalTask.Swimmable;

public class CydeoCar extends Car implements Flyable,Electricc,Auto_Pilot, Swimmable {

    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() {  // it comes from Flyable interface

    }

    @Override
    public void swim() {  // it comes from Swimmable interface

    }

    @Override
    public void autoPark() {
        // it comes from AutoPark interface, Autopilot is child of Autopark.
        // That means, it can reach methods inside AutoPark interface


    }

    @Override
    public void selfDrive() {  // it comes from AutoPilot interface

    }

    @Override
    public void charge() {  // it comes from Electric interface

    }

    @Override
    public void transportPeople() { // it comes from Transportaion Parent class

    }

    @Override
    public void start() { // it comes from Transportaion Parent class

    }
}
