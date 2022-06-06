package day09_scanner.practiceTasks;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle : ");
        double radius = input.nextDouble();

        double area = (radius * radius)* Math.PI;

        double perimeter = 2 * Math.PI * radius;

        System.out.println("area is : " + area);

        System.out.println("perimeter is : " + perimeter);

        input.close();


    }

}
/*
2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
*/