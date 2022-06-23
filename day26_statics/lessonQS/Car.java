package day26_statics.lessonQS;

public class Car {

    // more constructor means more options!

    /*

    this: refers to the instances

	this. : to call instance variables & instance methods
	this(): used for calling constructors in another constructor

    Constructor Calls:
		1. Constructors can not be called by its name ( this() need to be used)
		2. Only a constructor can call another constructor
		3. Constructor call MUST be at the first step
		4. One constructor can not call more than one constructor
		5. Constructor can not call or contain itself
     */

    public String make,model;
    public int year;
    public double price;

    public String color;

    public Car(String make){ // 1.Constructor

        this.make = make;

    }

    public Car(String make, String model){ // 2.Constructor
        this(make); // call the method in the line 20
        //this.make = make; it is not necessary
        this.model = model;
    }

    public Car(String make, String model, int year){ // 3.Constructor
        this(make,model); // call the method in the line 26
        this.year = year;
    }

    public Car(String make, String model, int year, double price){ // 4.Constructor
        this(make,model,year); // call the method in the line 32
        this.price = price;
    }

    public Car(String make, String model, int year, double price, String color){ // 5.Constructor
        this(make, model, year, price);
        this.color = color;


    }


    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }


    public static void main(String[] args) {



    }

}


/*

class name: Car
		 instance variables:
		 		make, model, year, price, color

	 		1st constructor: initializes the make ONLY

	 		2nd constructor: initializes make & model
	 				(MUST use constructor call to set the make)

			3rd constructor: initializes make, model, year
					(MUST use constructor call to set the make, model)

			4th constructor: initializes make, model, year, price
					(MUST use constructor call to set the make, model, year)

			5th Constructor: intializes all the instances
					(MUST use constructor call to set the make, mode, year, price, color)


		instance methods: toString

 */