package day14_forLoop;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a number");

        int num = input.nextInt();

        input.close();

        System.out.println(factorial(num));


    }


    public static int factorial(int num) {

        int factorialOfNumber = 1;

        for (int i = 1; i <= num; i++) {

            factorialOfNumber *= i;

        }


        return factorialOfNumber;
    }

}
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */



