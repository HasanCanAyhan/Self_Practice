package day29_inheritance.practiceTasks.phoneTask;

public class Phone { // ParentClass / SuperClass  - Task 2

    private String brand,model,size,color;
    private double price;

    public void terminate(String arg , String err){

        if(arg == null || arg.isEmpty() || arg.isBlank()){

            System.err.println(err);
            System.exit(1);

        }

    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        terminate(brand,"Invalid brand name");

        this.brand = brand;

        }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        terminate(model,"Invalid model name" );

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
        terminate(color,"Invalid color name ");

        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price <= 0){
            System.err.println("price can not be zero or negative: " + price);
            System.exit(1);
        }

        this.price = price;
    }


    public void setInfo(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public void call(long phoneNumber){
        System.out.println(brand + " - " + model + " phone is calling the phone number " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand + " - " + model + " phone is texting to the phone number " + phoneNumber);
    }


    public String toString() {
        return  getClass().getSimpleName()+"{" +
                "brand='" + getClass().getSimpleName() + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }


}
/*
phoneTask
    1. Create a named IPhone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Apple" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString(): prints Iphone object info when the object is passed in the print statement

	2. Create a class named Samsung:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Samsung" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString(): prints samsung object info when the object is passed in the print statement

	3. Create a class named Nokia:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Nokia" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString(): prints nokia object info when the object is passed in the print statement

 */