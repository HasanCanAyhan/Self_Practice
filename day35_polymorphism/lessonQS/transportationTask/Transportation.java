package day35_polymorphism.lessonQS.transportationTask;

public abstract class Transportation { // meant to be inherited

    private final String make, model;
    private String color;
    private final int year;
    private double price;


    public Transportation(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        setColor(color);
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public abstract void transportPeople();
    public abstract void start();

    /* Question ? :
     If we assume that every transport such as Car and Plane stops when the engine is turned off, why don’t we make stop method static? Why should we keep it instance?
        Answer:
     Since each object (each car, plane or any other vehicle) has their own stop button, we made it instance. If we make it static, there will be only one stop button for all objects. Static method/variable take only one unique example in the memory.

     */

    public void stop(){ // instance method
        System.out.println("Shut off the engine");
    }


    public String toString() {
        return   getClass().getSimpleName() +"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
warmup tasks:
	1. Create an abstract class named Transpotation
				Variables:
					make (final), model (final), color, year(final), price

				Encapsulate all the fields

				Add a constructor that can set all the fields

				abstract methods:
					transportPeople();
					start();

				non abstract methods:
					stop(): "Shut off the engine"
					toString()

 */