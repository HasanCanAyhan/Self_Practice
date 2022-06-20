package day22_arrayList.practiceTasks;

import java.util.ArrayList;

public class CombineTwoStringArraysIntoArrayList1 { // Another Solution

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        String[] arr1 = {"A", "B", "C"};

        String[] arr2 = {"D", "E", "F", "G"};


        for (String eachElement : arr1) {

            list.add(eachElement);

        }

        for (String eachElement : arr2) {
            list.add(eachElement);
        }

        System.out.println("list = " + list);




    }

}
/*
7.write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */