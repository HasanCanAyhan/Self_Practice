package day19_array.practiceTasks;

public class CommonElements { // Task 8

    public static void main(String[] args) {

        
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};


        String result = "";

        for (int i = 0 ; i < arr1.length ; i++) { // for arr1

            for (int j = 0; j < arr2.length ; j++) { // for arr2

                if( arr1[i] == arr2[j]    ){

                    result += arr1[i] + " ";
                }

            }


        }

        System.out.println("result = " + result); // result = 4 5


    }

}
/*
8. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */