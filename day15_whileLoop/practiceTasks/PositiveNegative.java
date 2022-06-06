package day15_whileLoop.practiceTasks;

import java.util.Scanner;

public class PositiveNegative { // Task 2

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int positive = 0;
        int negative = 0;

        for (int i = 1; i < 6 ; i++) {



            System.out.println("enter  num:");
            int num = input.nextInt(); // 10 20 -1 0 3

            if( num > 0 && num != 0){



                 positive += i - (i -1);



            }else if( num < 0 && num != 0){


                 negative += i - (i -1);

            }

        }

        System.out.println("positive numbers = " + positive);
        System.out.println("negative numbers = " + negative);




    }

}
/*
2. Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */