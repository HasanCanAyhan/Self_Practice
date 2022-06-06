package day19_array.lessonQS;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter ?:");
        int total_number = input.nextInt(); // That means , total_number is the size of the array, so the length of the array

        int[] numbers = new int[total_number];

        int sum = 0;
        for (int i = 0; i < total_number ; i++) {

            System.out.println("Enter a number");
            numbers[i] = input.nextInt();
            sum += numbers[i];

        }

        double average = 0;

        average = sum / (double)(total_number);

        DecimalFormat df = new DecimalFormat("0.00");


        System.out.println("Numbers: "+ Arrays.toString(numbers));
        System.out.println("sum = " + sum);
        System.out.println("average = " +   df.format(average));


    }

}
/*
5. AverageNumber:
	            1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number
 */
