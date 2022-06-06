package day14_forLoop;

import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("a string pls :) ");

        String str = input.next();

        System.out.println(isPalindrome(str));


    }

    public static boolean isPalindrome(String str) {

        boolean isPalindrome = true;

        for (int i = 0; i < str.length(); i++) { // Level

            if (("" + str.substring(0, 1)).equalsIgnoreCase("" + str.charAt(str.length() - 1))) {

                return isPalindrome;
            }else{
                return !isPalindrome;
            }

        }


            return isPalindrome;
        }


    }

    /* Another Solution

        String w = "level";
        String reverse = "";
        boolean isPalindrome;

        for (int i = w.length() - 1; i >= 0; i--) {

            reverse += w.charAt(i);

        }
        if (w.equalsIgnoreCase(reverse)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }
        System.out.println("isPalindrome = " + isPalindrome);

     */



/*
7. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true

 */
