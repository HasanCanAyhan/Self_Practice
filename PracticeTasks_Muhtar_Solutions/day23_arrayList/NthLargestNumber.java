package PracticeTasks_Muhtar_Solutions.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class NthLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 8, 4, 5, 6, 7, 7, 8, 8));

        int max = 0;
        int i = 0;

        int n = 5;
        for (int k = 0; k < n ; k++) {

            if (list.get(k) > max){
                max = list.get(k);
                i = list.indexOf(list.get(k));
            }

        }

        System.out.println(i);

    }

}
/*
write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5
            output:
                4
 */