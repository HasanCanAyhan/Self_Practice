package day19_array.practiceTasks;

import utilities.StringUtility;

import java.util.Arrays;

public class ReverseStudentsNames { // Task 2

    public static void main(String[] args) {


        // Example:

        String[] arr =  {"java", "python", "c#"};

        String zero =  arr[0]; // java

        String reversed = StringUtility.reverse(zero);

        System.out.println("reversed = " + reversed); // avaj

        System.out.println("---------------------------------------");

        //1.Way with method

        String[] array =  {"Hasan Can", "Boban", "Ermek"};

        for (int i = 0; i < array.length; i++) {

            // System.out.println(StringUtility.reverse(array[i]));  or:

            array[i] = StringUtility.reverse(array[i]);

        }

        System.out.println(Arrays.toString(array)); // [naC nasaH, naboB, kemrE]

        System.out.println("---------------------------------------");

        //2.Way

        String[] arr1=  {"java", "python", "c#"};
        // index :          0        1       2

        for (int i = 0; i < arr1.length; i++) { // i = 0 -->> java

            for (int j = arr1[i].length() - 1; j >= 0; j--) { // each character a-v-a-j

                System.out.print(arr1[i].charAt(j));

            }

            System.out.println();
        }








    }

}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */