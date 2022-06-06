package day09_scanner.practiceTasks;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter the first number : ");
        double n1 = input.nextDouble();
        System.out.println("enter a math operator : ");
        char math_operator = input.next().charAt(0);
        System.out.println("enter the second number : ");
        double n2 = input.nextDouble();

        String result ="the calculation result : ";


        if(math_operator == '+' || math_operator == '-' || math_operator == '*' || math_operator == '/'){

            if(math_operator == '+'){
                result += (n1 + n2);
            }else if(math_operator == '-'){
                result += (n1-n2);
            }else if (math_operator =='*'){
                result += (n1 * n2);
            }else{
                result += (n1 / n2);
            }

        }else{
         result = "Invalid entry";
        }


        System.out.println(result);

        input.close();





    }
}
/*
9. Create a class named Calculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"

 */
