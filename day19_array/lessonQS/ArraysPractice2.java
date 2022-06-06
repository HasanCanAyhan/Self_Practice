package day19_array.lessonQS;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        // 1.Way i & j

        int[] arr1 = new int[100];
        //   index num   value-element to assign
        for (int i = 0,  j = 1 ; i < arr1.length; i++, j++) {
            arr1[i] = j;
        }

        System.out.println("arr1 = " + Arrays.toString(arr1)); // 1 ~ 100


        System.out.println("----------------------------------");

        // Another way :  i , i+1

        int[] arr2 = new int[100];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }

        System.out.println("arr2 = " + Arrays.toString(arr2)); // 1 .....

        System.out.println("----------------------------------");


        // Reverse i & j

        int[] arr3 = new int[100]; // index  0 ~ 99
        //     index      value to assign
        for (int i = 0, j = 100; i < arr3.length; i++, j--) {
            arr3[i] = j;
        }

        System.out.println("arr3 = " + Arrays.toString(arr3)); // 100 ....

        System.out.println("-----------------------------");

        // Another way

        int [] arr4 = new int[100];

        for (int i = 0; i < arr4.length; i++) {

            arr4[i] = 100 - i;
        }

        System.out.println("arr4 = " + Arrays.toString(arr4)); // 100.....

    }

}
