package day14_forLoop;

import java.util.Scanner;

public class StringSumOfDigits {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("write a String in which the String has to digits :  "); // A1B2C3
        String str = input.next();

        System.out.println(stringSumOfDigits(str));


    }

    public static int  stringSumOfDigits(String str){

        int sum= 0;

        for (int i = 0; i < str.length() ; i++) {

            char character = str.charAt(i);
            boolean isNumber = character >= 48 && character <= 57;

            // 0: 48  1:49   2:50  ....... 9: 57

            if (isNumber) {
                sum += str.charAt(i) - 48;  // 0 --->> 48
            }

        }

        return sum;


    }



}
/*
6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
 */
