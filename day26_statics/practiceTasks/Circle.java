package day26_statics.practiceTasks;

import java.text.DecimalFormat;

public class Circle { // Task2


    public double radius,diameter;

    public static double pi = 3.14;


    public Circle(double radius) {
        this.radius = radius;
    }


    public double calcArea( ){

        return  pi * radius * radius  ;

    }



    public double  calcPerimeter(){

        diameter = 2 * radius;

        return  diameter * pi ;

    }


    public static void printPi(){

        System.out.println("Pi number is :" + pi);
    }


    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0");
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + df.format(calcArea()) +
                ", perimeter=" + df.format(calcPerimeter()) +
                '}';
    }
}
/*
2. Circle Task:
		1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement
 */