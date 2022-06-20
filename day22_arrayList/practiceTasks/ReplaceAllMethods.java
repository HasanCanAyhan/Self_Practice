package day22_arrayList.practiceTasks;

import java.util.Arrays;

public class ReplaceAllMethods { // Task 2

    public static void main(String[] args) {

        int[] array = {10, 10, 20, 30, 40, 30, 30, 30};


        System.out.println(Arrays.toString(   replaceAll(array,30,300)           ));

        System.out.println("-------------------------------------");

        String[] arr1 = {"Hasan", "Can", "Ayhan", "Can" , "Can"};

        System.out.println(Arrays.toString(    replaceAll(arr1,"Can","C")          ));



    }


    public static int[] replaceAll(int[] array,int oldElement, int newElement  ){

        int[] new_array = new int[array.length];

        for (int i = 0, j= 0; i < array.length; i++, j++) {

            if(array[i] == oldElement){

                array[i] = newElement;

                new_array[j] = array[i];
            }
            new_array[j] = array[i];

        }


        return new_array;
    }

    public static double[] replaceAll(double[] array,double oldElement, double newElement  ){

        double[] new_array = new double[array.length];

        for (int i = 0, j= 0; i < array.length; i++, j++) {

            if(array[i] == oldElement){

                array[i] = newElement;

                new_array[j] = array[i];
            }
            new_array[j] = array[i];

        }


        return new_array;
    }

    public static char[] replaceAll(char[] array,char oldElement, char newElement  ){

        char[] new_array = new char[array.length];

        for (int i = 0, j= 0; i < array.length; i++, j++) {

            if(array[i] == oldElement){

                array[i] = newElement;

                new_array[j] = array[i];
            }
            new_array[j] = array[i];

        }


        return new_array;
    }

    public static String[] replaceAll(String[] array,String oldElement, String newElement  ){

        String[] new_array = new String[array.length];

        for (int i = 0, j= 0; i < array.length; i++, j++) {

            if(array[i].equals(oldElement)){

                array[i] = newElement;

                new_array[j] = array[i];
            }
            new_array[j] = array[i];

        }


        return new_array;
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