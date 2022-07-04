package day30_inheritance.lessonQS.phoneTask;

import java.util.Arrays;

public class Phone {


    private String brand,model,size,color;
    private double price;

    // Constructor
    public Phone(String brand, String model, String size, String color, double price) { // 5 parameters
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink"};

        if (Arrays.asList(colors).contains(color)){ // we converted it to CollectionsType in order to use contains method
            this.color = color;
        }else{
            System.err.println("Invalid color: " + color + " color of the can only be : " + Arrays.toString(colors));
            System.exit(1);
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }

        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(getModel() + " is texting " + phoneNumber);
    }



    public String toString() {
        return   getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }



}
/*

Warmup tasks:
	1. Create a named Phone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. price can not be zero or negative
						2. color can only be set to:
								{"Black", "White", "Silver", "Gold", "Pink"}

				Add a constructor that can set all the fields

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

	2. Create the following subclasses of Phone:

			2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)

			2.2 Samsung:
					Extra methods:
						freeze()

			2.3 Nokia:
					Extra methods:
						selfDefense()
 */