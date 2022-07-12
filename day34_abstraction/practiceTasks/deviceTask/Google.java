package day34_abstraction.practiceTasks.deviceTask;

public class Google extends Phone implements Downloadable{

    public Google(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading App");
    }


}
