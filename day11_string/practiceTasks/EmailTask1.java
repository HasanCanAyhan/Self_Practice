package day11_string.practiceTasks;

import java.util.Scanner;

public class EmailTask1 { // Task8

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your email:");
        // Assume that email address is constructed by person's first name and followed by an underscore and last name.
        String email = input.next();

        String first_name = email.substring(0,email.indexOf("_")).toLowerCase();
        System.out.println(first_name);

        String last_name = email.substring(email.indexOf("_") +1,email.indexOf("@") ).toLowerCase();
        System.out.println(last_name);

        String remaining = email.substring(email.indexOf("@"));
        System.out.println(remaining);

        if(email.contains("_")){

            /*
            email = last_name + "_" +first_name + remaining;

            System.out.println(email);


             */

            email = email.replace(email.substring(email.indexOf("_") +1,email.indexOf("@") ),email.substring(0,email.indexOf("_")));


            email = email.replaceFirst(email.substring(email.indexOf("_") +1,email.indexOf("@") ),last_name);



        }

        System.out.println(email);



    }


}
/*

8. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com

 */