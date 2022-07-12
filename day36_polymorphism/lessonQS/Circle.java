package day36_polymorphism.lessonQS;

public class Circle {

    // Equals Method Overriding

    private double radius;
    public final static double PI = 3.14;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius * radius * PI;
    }

    public double perimeter(){
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }

    // .equals() for getting value not object

    /*
    * NOTE :  Equals method for custom classes

To give the customized conditions for the custom class objects to be equal
And in the original equal method you do not have the conditions that you wanted to check to see if two custom objects are equal
That’s why you have to override and give them by yourself

we have always override in subclass correct?
-Yes. If each subclass requires different conditions to determine if they are equal

 */



    // we compare one Circle to another one
    @Override
    public boolean equals(Object obj) { // it can be Any object

        //       obj : given object
        if (  ! (obj instanceof Circle)     ){// if the specified object is not circle, then we should not compare them
            System.err.println("Invalid Object");
            System.exit(1);
        }

        // if obj is a circle

        if ( this.radius ==   (  (Circle)obj ).radius){ // it must be casting from Object Class to Circle
            // if the current circle´radius is equal to the given circle´s radius, then two circles are equal
            return true;
        }

        return false;

    }



}
