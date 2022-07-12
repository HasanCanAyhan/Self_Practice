package day34_abstraction.practiceTasks.deviceTask;

public class Phone extends Device{


    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
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

    public void call(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is calling " + phoneNum);
    }

    public void text(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is texting " + phoneNum);
    }


}
/*
2. Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()
 */