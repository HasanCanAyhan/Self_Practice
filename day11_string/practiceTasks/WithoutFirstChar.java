package day11_string.practiceTasks;

import java.util.Scanner;

public class WithoutFirstChar { // task 5

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your first word : ");
        String s1 = input.next();

        System.out.println("enter your second word : ");
        String s2 = input.next();

        s1 = s1.substring(1);

        s2 = s2.substring(1);

        String r1 = s1 + s2 ;
        System.out.println(r1);


    }

}
/*
Medium Spicy:
	5. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */