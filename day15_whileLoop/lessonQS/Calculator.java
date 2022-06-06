package day15_whileLoop.lessonQS;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter first num:");
        int num1 = input.nextInt();

        System.out.println("enter second num:");
        int num2 = input.nextInt();

        System.out.println("enter the math operator:");
        char math_operator = input.next().charAt(0);

        while (    !(  math_operator == '+' || math_operator == '-' || math_operator == '*' || math_operator == '/'        )    ) {

            System.err.println("Invalid math operator ! Please re-enter");
            math_operator = input.next().charAt(0);
        }

        switch(math_operator){

            case '+':
                System.out.println((num1 + num2));
                break;
            case '-':
                System.out.println((num1 - num2));
                break;
            case '*':
                System.out.println( (num1 * num2));
                break;
            case '/':
                System.out.println((num1 / num2));
                break;

        }



    }

}
