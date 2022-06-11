package day20_forEach.practiceTasks;

public class CommonElements { // Task 3

    public static void main(String[] args) {


        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        for (int each_arr1 : arr1) {

            for (int each_arr2 : arr2) {

                if(each_arr1 == each_arr2){
                    System.out.println("each_arr1 = " + each_arr1);
                }


            }
            
            
        }


    }

}
/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops
 */
