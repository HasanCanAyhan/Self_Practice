package day20_forEach.lessonQS;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5};

        int[] reverse = new int[array.length]; // {5,4,3,2,1};

        /*
        for (int i = array.length - 1, j = 0; i >= 0; i--,j++) {
               reverse[j] = array[i];
        }


         */

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];

        }

        System.out.println("reverse = " + Arrays.toString(reverse));
        // reverse = [5, 4, 3, 2, 1]

        System.out.println("---------------------------------------------------------");

        // 2.Way- with method from ArraysUtility class

        int[] arr = {5,10,15,20};

        int[] arr_reversed = ArraysUtility.reverse(arr);

        System.out.println("arr_reversed = " + Arrays.toString(arr_reversed)); // arr_reversed = [20, 15, 10, 5]




        System.out.println("------------------------------");



        // for String- reverse

        String[] sentence = {"I", "Love" , "Java"};

        String[] reversed = new String[sentence.length];

        for (int i = sentence.length - 1, j = 0; i >= 0; i--) {

            reversed[j++] = sentence[i];

        }

        System.out.println("reversed = " + Arrays.toString(reversed)); // reversed = [Java, Love, I]


        System.out.println("---------------------");

        // 2.Way- with method from ArraysUtility class


        String[] str_arr= {"I", "Love" , "Java"};

        String[] reversed_arr = ArraysUtility.reverse(str_arr);

        System.out.println("reversed_arr = " + Arrays.toString(reversed_arr));// reversed_arr = [Java, Love, I]



    }

}
/*
3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};
	        output:
	            reversedArray = {5,4,3,2,1};
 */