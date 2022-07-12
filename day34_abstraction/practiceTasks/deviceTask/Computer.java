package day34_abstraction.practiceTasks.deviceTask;

public class Computer extends Device{

    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " is turning off");
    }



}
/*
3. Create a child abstract class of Device named Computer:

					Add any extra methods if needed
 */