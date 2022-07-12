package day34_abstraction.practiceTasks.deviceTask;

public class Samsung extends Phone implements Downloadable,AndroidApps{


    public Samsung(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }


    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading App from the Play Store");
    }
}
