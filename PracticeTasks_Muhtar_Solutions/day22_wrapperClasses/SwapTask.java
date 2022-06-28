package PracticeTasks_Muhtar_Solutions.day22_wrapperClasses;

import java.util.Arrays;

public class SwapTask {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString( swap(numbers,2,4 )   ));

    }


    public static int[] swap(int[] arr , int i , int j){

        for (int k = 0; k < arr.length; k++) {

            if(k == i){
                int temp = arr[i];

                arr[k] = arr[j];

                arr[j] = temp;

            }


        }


        /*
         int temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;

         */

        return arr;

    }


    public static double[] swap(double[] arr, int i, int j){

        double temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    public static char[] swap(char[] arr, int i, int j){

        char temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }


    public static String[] swap(String[] arr, int i, int j){

        String temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
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