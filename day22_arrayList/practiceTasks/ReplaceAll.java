package day22_arrayList.practiceTasks;

import java.util.Arrays;

public class ReplaceAll { // Task 2 - without using method

    public static void main(String[] args) {


        int[] array = {10, 10, 20, 30, 40, 30, 30, 30};

        // output : replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}

        int[] new_array = new int[array.length];


        for (int i = 0, j = 0; i < array.length; i++, j++) {

            if(array[i] == 30){
                array[i] = 300;
                new_array[j] = array[i];
            }

            new_array[j] = array[i];


        }

        System.out.println("new_array = " + Arrays.toString(new_array));


    }


}
/*
2. RecplaceAll Task:
        2.1 Create a method named replace that passes three parameters: integer array, integer oldElement, integer newElement. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


        2.2 Create the same functions for double arrays, char arrays, and String arrays
 */