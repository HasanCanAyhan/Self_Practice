package day11_string.practiceTasks;

import java.util.Scanner;

public class StartsWith { // Task 2

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter a word:");

        String word = input.next();

        if( word.startsWith("x")  ){

            word = word.replaceFirst("x", "a");

        }

        System.out.println(word);


    }

}
/*
2. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
	                    Input:
	                        xcodex
	                    Output:
	                        acodex


 */