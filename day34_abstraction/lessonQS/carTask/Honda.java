package day34_abstraction.lessonQS.carTask;

public class Honda extends Car{

    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() { // abstract method
        System.out.println("Twist the key to ignition to start " + getMake() + " "+ getModel());
    }



}
