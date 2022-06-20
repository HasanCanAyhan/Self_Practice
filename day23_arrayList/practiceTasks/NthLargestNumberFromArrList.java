package day23_arrayList.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class NthLargestNumberFromArrList { // Task 5

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int n = 5;

        int max = list.get(0);

        for (int i = 0; i < n -1 ; i++) {

            if(list.get(i)  > max ){
                max = list.get(i);
            }

        }

        System.out.println("max = " + max); // 4





    }

}
/*
5. write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	                         0 1 2 3 4 5
	            n = 5

            output:
                4
 */