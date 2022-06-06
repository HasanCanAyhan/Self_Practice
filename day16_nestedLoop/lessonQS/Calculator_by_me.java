package day16_nestedLoop.lessonQS;

import java.util.Scanner;

public class Calculator_by_me {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);




        while (true) { // inside of this loop there are 2 nested while loop


            System.out.println("enter first number:");
            double num1 = input.nextDouble();

            System.out.println("enter a math operator:");
            char operator = input.next().charAt(0);

            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {

                System.err.println("Invalid math operator");
                System.err.println("Pls re-enter a valid math operator:");
                operator = input.next().charAt(0);

            }

            System.out.println("enter your second number:");
            double num2 = input.nextDouble();

            switch (operator) {

                case '+':
                    System.out.println(num1 + num2);
                    break;

                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;

                default:

            }

            System.out.println("Would you like to continue? Yes/No");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {// while the user provides invalid answer
                System.err.println("Invalid Entry! Would you like to continue? Yes/No");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")) {
                break;// exit the loop
            }

        }


    }

}
/*
Task:
	1. Write a program for a simple calculator
			1.1 ask the user to enter first number: (double)
			1.2 ask the user to enter a math operator: (-, +, *, /)
				if the user enters invalid math operator, reapet the same step until user enters a valid operator

			1.3 ask the to enter the second number: (double)
			1.4 display the calculation result
			1.5 Would you like to continue? (Yes/No)
 */
