package PracticeTasks_Muhtar_Solutions.day19_array;

import java.util.Arrays;

public class MoveAllZerosToTheEnd {

    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};

        int[] new_arr = new int[array.length];


        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0){

                new_arr[j++] = array[i];

            }

        }

        System.out.println(Arrays.toString(new_arr));


    }

}
/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};
            output:
                 {10, 5, 1, 0, 0, 0}
 */