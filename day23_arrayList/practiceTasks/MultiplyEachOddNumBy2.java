package day23_arrayList.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyEachOddNumBy2 { // Task 7

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));


        ArrayList<Integer> new_list = new ArrayList<>();

        for (Integer each : list) {

            if (each % 2 != 0 ){
                new_list.add(each*2);
            } else{
                new_list.add(each);
            }


        }

        System.out.println("new_list = " + new_list);  // new_list = [2, 2, 6, 4, 10]

    }

}
/*
7. write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]

 */