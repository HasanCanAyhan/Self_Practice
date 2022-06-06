package day19_array.lessonQS;

public class MaxNumber {

    public static void main(String[] args) {

        int[] numbers = {100, 20, 500, 40, -10, 30};

        int max = numbers[0]; // assume that first element is the maximum number

        for (int i = 1; i < numbers.length; i++) { // i: 1, 2, 3, 4...
   //  numbers[i] ==>>>  each element inside the array
            if (  numbers[i] > max    ){ // compares the element of the array with current maximum number
                max = numbers[i];  // replace the current maximum number
            }

        }

        System.out.println("max = " + max); // 500


    }

}
/*
1. Write a program that can find the maximum number from an array
 */
