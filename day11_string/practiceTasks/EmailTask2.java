package day11_string.practiceTasks;

import java.util.Scanner;

public class EmailTask2 { // Task 9

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your email : ");
        // Assume that email address is constructed by person's first name and followed by an underscore and last name.
        String email = input.next();

        String first_name = email.substring(0,email.indexOf("_"));
        //System.out.println(first_name);

        String last_name = email.substring(email.indexOf("_") +1, email.indexOf("@"));
        //System.out.println(last_name);

        String domain = email.substring(email.indexOf("@") +1,email.indexOf("."));
       // System.out.println(domain);

        first_name = first_name.substring(0,1).toUpperCase() + first_name.substring(1).toLowerCase();
        System.out.println("first_name = " + first_name);

        last_name = last_name.substring(0,1).toUpperCase() + last_name.substring(1).toLowerCase();
        System.out.println("last_name = " + last_name);

        System.out.println("domain = " + domain);


    }

}
/*
9. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple

 */