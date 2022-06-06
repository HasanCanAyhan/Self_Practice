package day15_whileLoop.lessonQS;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);



        int max = -2147483648; //Any integer number that user enter will ALWAYS be greater than -2147483648


        for (int i = 0; i < 5 ; i++) {

            System.out.println("enter number please:");
            int  num = input.nextInt();

            if (num > max){
                max = num;
            }

        }

        System.out.println("max = " + max);
        input.close();




    }


}

/*
1. Write a program that can ask the user to enter a number for 5 times and returns the maximum number
 */
