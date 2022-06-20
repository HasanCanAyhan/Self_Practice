package day22_arrayList.practiceTasks;

import java.util.Arrays;

public class Swap { // Task 4

    public static void main(String[] args) {


        int[] arr = {10, 20, 30, 40, 50};
                //   0    1   2   3   4

        // output: swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}


        /* Swap :

         int n1 = 10;
         int n2 = 20;

        // Option -1 (by using 3rd variable)

        int n3 = 0; // temporaray
        n3 = n1; // n1 = 10   n2 = 20   n3 = 10
        n1 = n2;  // n1 = 20   n2 = 20   n3 = 10
        n2 = n3; // n1 = 20   n2 = 10   n3 = 10
         */
        int[] new_arr = new int[arr.length];

        int[] temp = new int[1];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {

            if (i == 2){

                temp[0] = arr[i]; // 30

                arr[i] = arr[4]; // 50

                new_arr[j] = arr[i]; // 50

                arr[4] = temp[0]; // 30

            }


            new_arr[j] = arr[i];


        }

        System.out.println("new_arr = " + Arrays.toString(new_arr));


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