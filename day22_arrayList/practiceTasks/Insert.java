package day22_arrayList.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Insert { // Task 3

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        //            0   1   2   3   4

        // output :  insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}
                                            // 0   1   2    3   4   5

        System.out.println(Arrays.toString( insert(arr,2,100)   ));


    }

    public static int[] insert(int[] arr, int index, int element) {
        int[] result = new int[arr.length + 1];
        int temp;

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                temp = arr[i];
                result[i] = element;
                result[i + 1] = temp;
            } else {
                if (result[i] != 0) {
                    temp = arr[i];
                    result[i + 1] = temp;
                } else {
                    result[i] = arr[i];
                }
            }
        }
        return result;
    }

    public static double[] insert(double[] arr, int index, double element) {
        double[] result = new double[arr.length + 1];
        double temp;

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                temp = arr[i];
                result[i] = element;
                result[i + 1] = temp;
            } else {
                if (result[i] != 0) {
                    temp = arr[i];
                    result[i + 1] = temp;
                } else {
                    result[i] = arr[i];
                }
            }
        }
        return result;
    }

    public static char[] insert(char[] arr, int index, char element) {
        char[] result = new char[arr.length + 1];
        char temp;

        for (int i = 0; i < result.length - 1; i++) {
            if (i == index) {
                temp = arr[i];
                result[i] = element;
                result[i + 1] = temp;
            } else {
                if (result[i] != 0) {
                    temp = arr[i];
                    result[i + 1] = temp;
                } else {
                    result[i] = arr[i];
                }
            }
        }
        return result;
    }

    public static String[] insert(String[] arr, int index, String element){
        String[] result = new String[arr.length + 1];
        String temp;

        for (int i = 0; i < result.length - 1; i++) {
            if(i == index){
                temp = arr[i];
                result[i] = element;
                result[i + 1] = temp;
            } else {
                if(result[i] != null){
                    temp = arr[i];
                    result[i + 1] = temp;
                } else {
                    result[i] = arr[i];
                }
            }
        }
        return result;
    }


}
/*
4. Swap Task:
    2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
            Ex:
                arr = {10, 20, 30, 40, 50};

                swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

    2.2 Create the same function for double array, char array and string array
 */