package day11_string.practiceTasks;

import java.util.Scanner;

public class FullName { // Task7

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the first word :");
        String firstName = input.next();

        System.out.println("enter the second word :");
        String secondName = input.next();


        input.close();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();


        secondName = secondName.substring(0,1).toUpperCase() + secondName.substring(1).toLowerCase();


        String result = firstName + " " +secondName;

        System.out.println(result);


    }

}
/*
ery Spicy:
	7. Write a program that asks user to enter first and last names,
	and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School

 */
