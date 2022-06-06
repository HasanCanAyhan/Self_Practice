package day09_scanner.practiceTasks;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your cents  : ");

        int cent = input.nextInt();

        int remaining = 0;

        int numberOfDollars = cent / 100;
        remaining = cent %100;

        int numberofCents = remaining;

        System.out.println("Your " + cent + " equal to : " + numberOfDollars + " dollars and " + numberofCents + " cents");

        input.close();


    }

}
/*
 5. Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */