package day30_inheritance.practiceTasks.deviceTask;

public class Laptop extends Computer{
    public Laptop(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton, int RAM) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton, RAM);
    }
}
