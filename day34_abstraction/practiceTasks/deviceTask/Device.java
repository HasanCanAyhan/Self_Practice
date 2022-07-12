package day34_abstraction.practiceTasks.deviceTask;

public abstract class Device {

    private final String brand , model;
    private double price;
    private String color;
    private final String size;
    private boolean hasBattery,hasPowerButton;

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        if (brand == null || brand.trim().isEmpty()){
            System.err.println("Invalid brand");
            System.exit(1);
        }
        this.brand = brand;
        if (model == null || model.trim().isEmpty()){
            System.err.println("Invalid model");
            System.exit(1);
        }
        this.model = model;
        this.price = price;
        this.color = color;
        if (size == null || size.trim().isEmpty()){
            System.err.println("Invalid size");
            System.exit(1);
        }
        this.size = size;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public void setPrice(double price) {

        if (price <= 0){
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }

        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public abstract void turnOn();
    public abstract void turnOff();


    public String toString() {
        return   getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
Device Task:
	1. Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price
 */