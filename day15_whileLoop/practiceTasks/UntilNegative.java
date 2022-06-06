package day15_whileLoop.practiceTasks;

import java.util.Scanner;

public class UntilNegative { // Task 5

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("enter a num");
        int num = input.nextInt();
        
        int sum = 0;
        
        while(num >= 0){
            System.out.println("enter a number");
            sum += num;
            num = input.nextInt();
            
        }

        System.out.println("sum = " + sum);




    }


}

/*
5.Create a class named UntilNegative and Write a program
that calculates the sum of numbers entered by the user until user enters a negative number.

 */
