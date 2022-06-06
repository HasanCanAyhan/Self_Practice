package day19_array.lessonQS;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {


        char[] alphabet_ascending = new char[26];
        char[] alphabet_descending = new char[26];

        for (int i = 0 , j = 'A' , k = 'Z' ; i < alphabet_ascending.length; i++, j++, k--) {

            alphabet_ascending[i] = (char) j; // required : char  provided: int  because alphabet_ascending is char data taype

            alphabet_descending[i] = (char)k; // required : char  provided: int

        }


        System.out.println("alphabet_ascending = " + Arrays.toString(alphabet_ascending)); // A-Z
        System.out.println("alphabet_descending = " + Arrays.toString(alphabet_descending));// Z - A


    }
}
/*
3. Create a char array and store all the alphabet letters in ascending order
4. Create a char array and store all the alphabet letters in descending order

 */