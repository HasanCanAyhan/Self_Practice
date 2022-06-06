package day16_nestedLoop.practiceTasks;

import java.util.Scanner;

public class Square { // Task 5

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        for (; ; ) { // infinite for -loop


            System.out.println("Enter the side of the square:");

            double valueOfSide = input.nextDouble();

            if (valueOfSide <= 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(1); //  System.exit(1) to terminate the entire program
            }

            double area = valueOfSide * valueOfSide;
            double perimeter = valueOfSide * 4;


            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another Square? Yes/No");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {

                System.err.println("Invalid Entry!Please re-enter:");
                answer = input.next();

            }

            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break; // exit the for loop
            }


        } // for loop


    }


}
/*
5. Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square

                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program
 */