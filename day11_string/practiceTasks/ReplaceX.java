package day11_string.practiceTasks;

import java.util.Scanner;

public class ReplaceX { // Task3

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a word:");

        String word = input.next();



        if (word.contains("x") || word.contains("X")){

            String r1 = word.replaceAll("x", "a");
            String r2 = r1.replaceAll("X", "a");

            System.out.println(r2);

        }

        input.close();


    }


}
/*

3. Write a program that asks user to enter a word. and replace all the x or X with character a
	                    Input:
	                        xcodeX
	                    Output:
	                        acodea


 */
