package day19_array.lessonQS;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {


        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println("numbers = " + Arrays.toString(numbers) ); // 10 20 30 40 50

        // or:

        System.out.println("-----------------------------------");


        for (int i = 0; i < numbers.length; i++) { // i : index numbers of scores array
            System.out.println( numbers[i] ); // 10 20 30 40 50
        }


        System.out.println("-----------------------------------------");

        int[] scores = new int[5];     // index : 0 ~ 4


        for (int i = 0 , j = 10; i < scores.length; i++, j += 10) {

            scores[i] = j; // i = 0  j = 10 , i = 1 , j = 20 ......
            // index    value
        }


        System.out.println("scores = " + Arrays.toString(scores) );



    }

}
