package day22_arrayList.practiceTasks;

import java.util.Arrays;

public class ReplaceMethod { // Task 1


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString( replace(arr,2,30)   )  );

        String[] arr1 = {"Hasan", "Can", "Ayhan"};

        System.out.println(Arrays.toString(  replace(arr1,1,"Aras")   ));



    }
    
    public static int[] replace(int[] array , int index, int element ){

        int[] new_arr = new int[array.length];

        for (int i = 0, j = 0; i < array.length; i++, j++) {

            if (i == index ){
                array[i] = element;
                new_arr[j] =  array[i];
            }

            new_arr[j] = array[i];

        }



        return new_arr;

    }

    public static double[] replace(double[] array , double index, double element ){

        double[] new_arr = new double[array.length];

        for (int i = 0, j = 0; i < array.length; i++, j++) {

            if (i == index ){
                array[i] = element;
                new_arr[j] =  array[i];
            }

            new_arr[j] = array[i];

        }



        return new_arr;

    }

    public static char[] replace(char[] array , int index, char element ){

        char[] new_arr = new char[array.length];

        for (int i = 0, j = 0; i < array.length; i++, j++) {

            if (i == index ){
                array[i] = element;
                new_arr[j] =  array[i];
            }

            new_arr[j] = array[i];

        }



        return new_arr;

    }

    public static String[] replace(String[] array , int index, String element ){

        String[] new_arr = new String[array.length];

        for (int i = 0, j = 0; i < array.length; i++, j++) {

            if (i == index ){
                array[i] = element;
                new_arr[j] =  array[i];
            }

            new_arr[j] = array[i];

        }



        return new_arr;

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