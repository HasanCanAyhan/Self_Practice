package day35_polymorphism.lessonQS.transportationTask;

public class Audi extends Car implements Auto_Park{

    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {  // it comes from Parent class

    }

    @Override
    public void start() { // it comes from Parent class

    }

    @Override
    public void autoPark() { // it comes from AutoPark interface

    }




}
/*
7. Create a sub class of car named Audi that implements AutoPark
 */