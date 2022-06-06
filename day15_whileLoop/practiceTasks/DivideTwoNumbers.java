package day15_whileLoop.practiceTasks;

import java.util.Scanner;

public class DivideTwoNumbers {// Task4

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        int counterDiv = 0;

        while(num1 >= num2){
            num1 -= num2;
            counterDiv += 1;
        }

        System.out.println(counterDiv);




    }



}
/*
4.  Create a class named DivideTwoNumbers
and Write a program that can divide two positive numbers
without using / (division) and * (multiplication) operators.
 */