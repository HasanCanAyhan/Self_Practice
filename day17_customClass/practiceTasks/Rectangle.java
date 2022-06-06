package day17_customClass.practiceTasks;

public class Rectangle { // Task 3

    // Attributes-Instances

    public double length;
    public double width;


    // Set Info

    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // CalculateArea - Method

    public  double calculateArea(double length, double width){

        this.length = length;
        this.width = width;

        double area = length * width;
        return area;

    }

    // calculatePerimeter() - Method

    public  double calculatePerimeter(double length,double width){

        this.width = width;
        this.length = length;
        double perimeter = 2 * (length + width);
        return perimeter;

    }

    // to String


    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calculateArea(length,width) +
                ", perimeter=" + calculatePerimeter(length,width) +
                '}';
    }
}
/*
3. create a custom class named Rectangle
		Attributes:
		    length, width

		Actions:
		    setInfo(): sets the length and width of the rectangle object
		    calculateArea(): calculates the area of the rectangle, returns it as double
		    calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
		    toString(): when a rectangle object is passed in print statement
		    		it should diplay the length, width, area and perimeter of the Rectangle object

 */
