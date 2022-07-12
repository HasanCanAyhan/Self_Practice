package day34_abstraction.practiceTasks.deviceTask;

public class Iphone extends Phone implements Downloadable,AppleApps{


    public Iphone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }


    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading App from the Apple Store");
    }


}
/*
7. Create the following sub classes of Phone and add any extra methods that are needed:

				1. Iphone :
						extends Phone class and implements Downloadable & AppleApps interfaces

				2. Samsung:
						extends Phone class and implements Downloadable & AndroidApps interfaces

				4. Google:
						extends Phone class and implements Downloadable & AndroidApps interfaces
 */
