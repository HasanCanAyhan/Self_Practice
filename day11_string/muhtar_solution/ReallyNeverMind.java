package day11_string.muhtar_solution;

import java.util.Scanner;

public class ReallyNeverMind {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a word:");
        String word = input.next();

        String lastTwoChars = word.substring(word.length() -2);

        if(lastTwoChars.equals("ly")){

            System.out.println("really????");

        }else{

            System.out.println("Never mind");
        }

        input.close();



    }

}
/*
4. Create a class named ReallyNeverMind. Ask the user to enter a word.
if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */