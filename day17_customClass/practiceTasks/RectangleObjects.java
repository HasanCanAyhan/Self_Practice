package day17_customClass.practiceTasks;

public class RectangleObjects { // Task 3

    public static void main(String[] args) {


        Rectangle rectangle_1 = new Rectangle();

        rectangle_1.setInfo(12.5,10.0);

        System.out.println(rectangle_1);





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