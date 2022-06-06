package day14_forLoop;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter a num to sum till the num :");

        int num = input.nextInt();

        input.close();

        System.out.println(sum(num));


    }


    public static int sum(int num){
        int sum = 0;

        for (int i = 0; i <= num ; i++) {

            sum += i;

        }

        return sum;
    }

}
/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */
