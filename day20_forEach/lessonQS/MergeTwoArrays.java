package day20_forEach.lessonQS;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};


        int[] arr3 = new int[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {

            arr3[k] = arr1[i];
        }

        //System.out.println("arr3 = " + Arrays.toString(arr3)); // arr3 = [1, 2, 3, 4, 0, 0]

        //k =4; in order to track the index number of arr3

        for (int i = 0; i < arr2.length; i++,k++) {

            arr3[k] = arr2[i];

        }


        System.out.println("arr3 = " + Arrays.toString(arr3));// arr3 = [1, 2, 3, 4, 5, 6]

        System.out.println("---------------------------------------");

        // 2.Way  with the method from the ArraysUtility class

        int[] arr4 = {1, 2, 3, 4,5,6,7,8};
        int[] arr5 = {9,10};


        int[] arr6 = ArraysUtility.merge(arr4,arr5);

        System.out.println(Arrays.toString(arr6));  // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    }

}
/*
write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}
	        output
	            arr3 = {1,2,3,4,5,6}
 */