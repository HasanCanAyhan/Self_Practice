package day22_arrayList.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinNumberFromArrayList1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int max = list.get(0);
        int min = list.get(0);

        for (Integer num : list) {
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }




    }



