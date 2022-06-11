package day21_multiDimentionalArray.lessonQS;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        /*

        regular variable :

            int age = 10;
            String name = "Java";

        Array :  special variable

            Single Dimensional Array : [], used for containing multiple elements
            Multi Dimensional Array  : [] [] used for containing multiple arrays

            Note: The N dimensional array is a container for ( N-1 ) dimensional arrays

         */


        /*

        int[][] array2D = new int[3][];   3 means the number of one-dimensional arrays
        int[][] array2D = {  {1,2}  ,  {3,4,5}  ,  {6,7,8,9}   }

         */

        // one dimensional array contains elements
        int[] arr1 = {10,20,30};
        int[] arr2 = {40,50,60,70,80};
        int[] arr3 = {90,100};


        //indexOfElements:  0  1  2      0  1  2  3  4      0  1
        int[][] arr2D = { {10,20,30} , {40,50,60,70,80} , {90,100}   };   // 2D Array --->>  1D Arrays ----> Elements
        // index of 1D Array:   0              1              2

        System.out.println(arr2D.length); // 3 - one dimensional arrays

        System.out.println(Arrays.toString(  arr2D[1]   )); // [40, 50, 60, 70, 80]

        System.out.println((arr2D[2][0]));  // 90



    }




}
