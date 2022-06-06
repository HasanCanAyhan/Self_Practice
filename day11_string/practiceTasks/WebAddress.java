package day11_string.practiceTasks;

import java.util.Scanner;

public class WebAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the website you want to google:");
        String website = input.next();

        if (  website.startsWith("www.")  && ( website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov")  )  ){

            System.out.println("Valid!");

        }else{
            System.out.println("Invalid!Try again!");
        }


        input.close();


    }

}
/*

Not Spicy:
	1. write a program that can check if the given website is valid website or not
	            starts with: www.
	            ends with: .com, .edu, .gov

 */
