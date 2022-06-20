package day22_arrayList.practiceTasks;

import java.util.Arrays;

public class SwapMethod { // Task4

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString( swap(arr,2,4)  ));

        System.out.println("-------------------");

        double[] arr1 = {10.1, 20.2, 30.3, 40.4, 50.5};

        System.out.println(Arrays.toString( swap(arr1, 2,4)  ));
        
        
        System.out.println("-------------------");

        char[] arr2 = { 'a', 'b', 'c' , 'd' , 'e'   };

        System.out.println(Arrays.toString( swap(arr2,2,4)  ));

        System.out.println("-------------------");

        String[] str = {"Hasan", " Can", "Ayhan","Jack" };

        System.out.println(Arrays.toString( swap(str,2,3)   ));

    }


    public static int[] swap(int[] arr, int i, int j ){

        int[] new_arr = new int[arr.length];

        int[] temp = new int[1];

        for (int k = 0, m= 0; k < arr.length; k++, m++) {

            if(k == i){ // k = 2 ;

                temp[0] = arr[i]; // temp [0] = 30

                arr[i] = arr[j]; // 50

                new_arr[m] =arr[i]; // 50

                arr[j] = temp[0]; // 30

            }


            new_arr[m] = arr[k];

        }



        return new_arr;
    }

    public static double[] swap(double[] arr, int i, int j ){

        double[] new_arr = new double[arr.length];

        double[] temp = new double[1];

        for (int k = 0, m= 0; k < arr.length; k++, m++) {

            if(k == i){ // k = 2 ;

                temp[0] = arr[i]; // temp [0] = 30

                arr[i] = arr[j]; // 50

                new_arr[m] =arr[i]; // 50

                arr[j] = temp[0]; // 30

            }


            new_arr[m] = arr[k];

        }



        return new_arr;
    }


    public static char[] swap(char[] arr, int i, int j ){

        char[] new_arr = new char[arr.length];

        char[] temp = new char[1];

        for (int k = 0, m= 0; k < arr.length; k++, m++) {

            if(k == i){ // k = 2 ;

                temp[0] = arr[i]; // temp [0] = 30

                arr[i] = arr[j]; // 50

                new_arr[m] =arr[i]; // 50

                arr[j] = temp[0]; // 30

            }


            new_arr[m] = arr[k];

        }



        return new_arr;
    }

    public static String[] swap(String[] arr, int i, int j ){

        String[] new_arr = new String[arr.length];

        String[] temp = new String[1];

        for (int k = 0, m= 0; k < arr.length; k++, m++) {

            if(k == i){ // k = 2 ;

                temp[0] = arr[i]; // temp [0] = 30

                arr[i] = arr[j]; // 50

                new_arr[m] =arr[i]; // 50

                arr[j] = temp[0]; // 30

            }


            new_arr[m] = arr[k];

        }



        return new_arr;
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
