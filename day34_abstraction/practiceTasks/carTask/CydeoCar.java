package day34_abstraction.practiceTasks.carTask;

public class CydeoCar extends Car implements AutoPark,AutoPilot,Flyable{

    public CydeoCar(String make, String model, int year, double price, String color) {
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

    @Override
    public void fly() {
        System.out.println(getMake() + " " + getModel() + " is flying");
    }
}
/*
10 Create a sub class of Car named CydeoCar that implements AutoPark, AutoPilot and Flyable interfaces
 */