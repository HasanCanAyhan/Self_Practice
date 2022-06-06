package day11_string.practiceTasks;

import java.util.Scanner;

public class ReallyNeverMind { // Task4

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a word:");

        String word = input.next();


        if ( word.endsWith("ly")     ){

            System.out.println("really?");

        }else{
            System.out.println("never mind");
        }


    }

}
/*
4. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"

 */
