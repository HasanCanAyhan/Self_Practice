package day19_array.practiceTasks;

import java.util.Arrays;

public class ZerosToTheEnd { // Task 7

    public static void main(String[] args) {



        int[]  array = {10, 0, 5, 0, 1, 0};

        int[] new_array = new int[array.length];

        for (int i = 0, j = 0; i < array.length; i++) {

            if( array[i] != 0 ){
                new_array[j] = array[i];
                j++;

            }

        }


        System.out.println("new_array = " + Arrays.toString(new_array));


    }


}
/*
7.
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */