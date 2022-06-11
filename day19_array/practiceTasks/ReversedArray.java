package day19_array.practiceTasks;

import java.util.Arrays;

public class ReversedArray { // Task 6


    public static void main(String[] args) {


        int[] array = {60, 55, 45, 30, 10};
        //              0   1   2   3   4

        int[] reversedArray = new int[array.length];

        //   reversedArray[i]= 0  ,  array[j] = 10;
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) { // i -->> for reversedArray index, j ---->>  for array index as reversed

            reversedArray[i] = array[j];
        }

        System.out.println("reversedArray = " + Arrays.toString(reversedArray)); // reversedArray = [10, 30, 45, 55, 60]

        System.out.println("---------------------------------------");

        // or you can do this:

        int[] array1 = {1, 2, 3, 4, 5};
        int[] reversed = new int[array.length];

        //   i = 4   array[i] = 5
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) { // j for reversed index, i for array index as reversed

            reversed[j] = array[i];
        }
        System.out.println(Arrays.toString(reversed));


    }


}
/*

6.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */