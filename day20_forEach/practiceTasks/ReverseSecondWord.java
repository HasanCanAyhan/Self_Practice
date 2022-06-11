package day20_forEach.practiceTasks;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseSecondWord { // Task 1

    public static void main(String[] args) {


        /*  Another Solution 1

         String sentence = "I Love Java";
        String[] array = sentence.split(" ");

        String reversedSecond = "";
        for (int i = array[1].length() - 1; i >= 0; i--) {
            reversedSecond += array[1].charAt(i);
        }
        array[1] = reversedSecond;

        for ( String each : array ) {
            System.out.print(each + " ");
        }

         */

        /*  Another Solution 2


        String sentence = "I Love Java";

        String[] arr = sentence.split(" ");

       arr[1] = StringUtility.reverse(arr[1]);

        for (String each : arr) {
            System.out.print(each+" ");
        }
//console
I evoL Java
         */

        String str = "I Love Java";

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words)); // [I, Love, Java]

        String second = words[1];

        String reversed = "";

        for (int i = second.length() -1; i >= 0 ; i--) {

            reversed += second.charAt(i);

        }

        System.out.println("reversed = " + reversed); // evoL

        String reversed_result = "";

        for (String each : words) {

            if(each.equals("Love")){
                each = reversed;

            }

            reversed_result += each + " ";

        }

        System.out.println("reversed_result = " + reversed_result);  // I evoL Java


        // or : 2:Way with method ( StringUtility.reverse() )


        /*
        String str = "I Love Java";

        String[] words = str.split(" ");

        System.out.println("words = " + Arrays.toString(words)); // words = [I, Love, Java]


        String second = StringUtility.reverse(words[1]); *****


        System.out.println("second = " + second); // evoL

        System.out.println(words[0] + " " + second + " " + words[2]); // I evoL Java ****

         */




    }

}
/*
1. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java

 */