package day36_polymorphism.lessonQS;

import java.util.Arrays;

public class IPhone {

    private String brand,model,size,color;
    private double price;

    // Constructor
    public IPhone(String brand, String model, String size, String color, double price) { // 5 parameters
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
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink","Blue","Red","Gray"};

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

    // it should be same model and color


    @Override
    public boolean equals(Object obj) {

        if ( !(obj instanceof IPhone)){ // if the given object is not IPhone
            System.err.println("Invalid object, Object must be Iphone");
            System.exit(1);
        }
        //  current              given
        if (model.equals(  ( (IPhone)obj  ).model)    ){ // if the model of the Iphone is equal to the given Iphone´model

         /* you can add also this condition:
            if (color.equals( ((IPhone) obj).color  )){ // if the color of Iphone is equal to the given Iphone´s color
                return true;
            }

          */

            return true;
        }

        return false;

    }



}
