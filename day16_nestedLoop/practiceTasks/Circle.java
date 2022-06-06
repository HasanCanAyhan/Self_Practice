package day16_nestedLoop.practiceTasks;

import java.util.Scanner;

public class Circle { // Task 4

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);



        String answer = "yes";


        while (answer.equals("yes")) {

            System.out.println("Enter the radius of the circle:");

            double radius = input.nextDouble();

            if (radius < 0) {

                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(1);
            }

            double diameter = 2 * radius;

            double area = (3.14 * radius * radius) / 4;

            double perimeter = 2 * 3.14 * radius;

            System.out.println("diameter = " + diameter);
            System.out.println("Area of the square is " + area);
            System.out.println("Perimeter of the square is " + perimeter);

            System.out.println("Would you like to calculate another circle? Yes/No ");
            answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {

                System.err.println("Invalid Answer! Please re-enter:");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;

            }


        }


    }

}
/*
4. Write a program that can calculate the area and perimeter of a circle:

    1. Ask the user "Enter the radius of the circle:"
    if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

     2. Display:
         1. Diameter of circle
         2. Area of circle
         3. Perimeter of circle

     3. Ask the user "Would you like to calculate another circle?"
          If "yes" --> repeat the previous steps
          If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

           If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

           Hint: you can use  System.exit(1) to terminate the entire program

 */