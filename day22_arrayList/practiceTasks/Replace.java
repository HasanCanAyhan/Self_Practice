package day22_arrayList.practiceTasks;

import java.util.Arrays;

public class Replace { // Task1 - without using method

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};

        int[] new_arr = new int[arr.length];

        for (int i = 0 , j = 0; i < arr.length; i++,j++) {

            if(i == 2 ){
                arr[i] = 30;
                new_arr[j] = arr[i];
            }

            new_arr[j] = arr[i];

        }

        System.out.println("new_arr = " + Arrays.toString(new_arr));

        //  replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}

      //  int[] new_array = Arrays.copyOf(arr, arr.length);

        //System.out.println("new_array = " + Arrays.toString(new_array));


        //new_array[2] = 30;

        //System.out.println("new_array = " + Arrays.toString(new_array));


    }

}
/*
1. Replace Task:
        1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


        1.2 Create the same functions for double arrays, char arrays, and String arrays
 */