package day32_finalKeyword.lessonQS.carTask_methodOverriding;

public class Car {

    private String make, model, color;
    private int year;
    private double price;

    public static int numberOfWheels;  // public can be inherited
    public static boolean hasBattery;

    public Car(String model, String color, int year, double price) { // we do not need to write make, because we know it
        //note: make of the car can be set to the class name
        setMake(getClass().getSimpleName());// setting the class name to the make of the car
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }

    static { // static block : one times - one copy
        numberOfWheels = 4;
        hasBattery = true;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        if (year <= 0){// if specified year is negative ot zero
            System.err.println("Invalid year: " + year);
            System.exit(1);// terminates the program
        }

        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price <= 0){ // if specified price is negative ot zero
            System.err.println("Invalid price: " + price);
            System.exit(1);// terminates the program
        }

        this.price = price;
    }


    public void start(){
        System.out.println("Press the brake and twist the key to ignition to start " + make + " " + model);
    }

    @Override
    public String toString() {
        return   make+"{" + // we write here " make" because it equals = getClass().getSimpleName()
                //"make='" + make + '\'' +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", wheels=" + numberOfWheels +
                '}';
    }



}
/*
Warmup tasks:
	1. Create a class named Car
            Variables:
                make, model, color, year, price, numberOfWheels (static), hasBattery (static)

            Encapsulate all the fields
                    Condition:
                        1. year can not be negative or zero
                        2. price can not be negative or zero

            Add a constructor that can set all the fields
                    note: make of the car can be set to the class name

            Methods:
                start(): "Press the brake and twist the key to ignition"

                toString()


	2. Create the following sub classes and override the start() method if needed:

            1. Toyota
                	start(): "Press the brake and twist the key to ignition"

             2. Honda
                    start(): "Press the brake and twist the key to ignition"

            3. Audi
                	start(): "Press the start button"

            4. BMW
                	start(): "Call the mechanic or jump start "

            5. Tesla
               		start(): "Say \"Start\""

	                Extra method:
	                    autoPilot()

	                Extra Conditions for the variables:****
	                    1. Model of tesla can only be set to one of the followings:
	                        {"Model S", "Model Y", "Model x", "Model 3" };
	                    2. color of tesla can only be set to one of the followings:
	                        {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}
	                    3. year of the tesla can not be less than 2008
	                    4. price of tesla can not be less than 50k


 */