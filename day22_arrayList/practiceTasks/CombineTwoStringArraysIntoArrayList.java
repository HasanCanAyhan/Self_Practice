package day22_arrayList.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoStringArraysIntoArrayList { // Task 7

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        String[] arr1 = {"A", "B", "C"};

        String[] arr2 = {"D", "E", "F", "G"};

        // arr1
        list.add(arr1[0]);
        list.add(arr1[1]);
        list.add(arr1[2]);
        // arr2
        list.add(arr2[0]);
        list.add(arr2[1]);
        list.add(arr2[2]);
        list.add(arr2[3]);

        System.out.println(list); // [A, B, C, D, E, F, G]

        /* Another Solution
         String[] array1 = {"A", "B", "C"};
    String[] array2 = {"D", "E", "F", "G"};
    ArrayList<String> list = new ArrayList<>();

        for (int i = 0, j=0-array1.length; i < array1.length+array2.length; i++, j++) {
            if(i<array1.length){
                list.add(array1[i]);
            }else {
                list.add(array2[j]);

            }
        }

        System.out.println(list);


         */





    }



}
/*
7.write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */