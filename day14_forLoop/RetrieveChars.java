package day14_forLoop;

import java.util.Scanner;

public class RetrieveChars {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("a word");
        String str = input.next(); //mn@#123Ab!

        System.out.println(retrieveChars(str));



    }

    public static String retrieveChars(String str){



        String digits = "";
        String letters = "";
        String special_chars = "";



        for (int i = 0; i <= str.length()-1 ; i++) {

            char character = str.charAt(i);

            if (character >= '1' && character <= '9'){
                digits += character;

            }else if(   (character >= 'A' && character <= 'Z')  || (character >= 'a' && character <= 'z')  ){

                letters += character;
            }else{
                special_chars += character;
            }

        }

        String s = "digits : " + digits + "\nletters: " + letters + "\nspecial_chars: " + special_chars;

            return s;


    }



}
/*
5. write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */
