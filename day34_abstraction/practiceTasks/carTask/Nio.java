package day34_abstraction.practiceTasks.carTask;

public class Nio extends Car implements AutoPark,AutoPilot{

    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " has auto park system");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " has self driving system");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " is starting");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is driving");
    }
}
/*
	9. Create Two sub classes of Car named Tesla & Nio that implements AutoPark & AutoPilot interfaces
 */