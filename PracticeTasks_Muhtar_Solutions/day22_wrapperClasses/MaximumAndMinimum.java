package PracticeTasks_Muhtar_Solutions.day22_wrapperClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumAndMinimum {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));


        int max = Collections.max(list);

        int min = Collections.min(list);

        /*
        int max = list.get(0);
        int min = list.get(0);

        for (Integer each : list) {
            if(each > max){
                max = each;
            }

            if(each < min){
                min = each;
            }

        }
         */



        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }

}
/*
Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];
            output:
                Maximum number is 5
                Minimum number is 1
 */