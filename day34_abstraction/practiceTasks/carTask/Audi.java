package day34_abstraction.practiceTasks.carTask;

public class Audi extends Car implements AutoPark{

    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " starts");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is driving");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " has auto park features");
    }


}
/*
	8. Create two sub class of Car named Audi &  Mercedes that implements AutoPark interface

 */