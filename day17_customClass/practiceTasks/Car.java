package day17_customClass.practiceTasks;

public class Car { // Task 1

    public String make;
    public String model;
    public int year;
    public String color;
    public double price;

    // setInfo(): sets all the fields of the car object
    public void setInfo(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public void start(){
        System.out.println(make + " starts.");
    }

    // toString(): when a car object is passed in print statement, it should display all the information of the car object
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
1. Create a custom class named Car
		Attributes:
			make, model, year, color, price

		Actions:
			setInfo(): sets all the fields of the car object
			toString(): when a car object is passed in print statement, it should display all the information of the car object
			start()
 */
