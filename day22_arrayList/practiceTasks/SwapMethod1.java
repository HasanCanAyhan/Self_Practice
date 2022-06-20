package day22_arrayList.practiceTasks;

import java.util.Arrays;

public class SwapMethod1 { // Another solution returns the array again, not new_array

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString( swap(arr,2,4)  ));

    }


    public static int[] swap(int[] arr, int i, int j ){

        int temp = 0;

        for (int k = 0; k < arr.length; k++) {

            if(k == i){ // k = 2 ;

                temp = arr[i]; // temp [0] = 30

                arr[i] = arr[j]; // 50

                arr[j] = temp;

            }

        }

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