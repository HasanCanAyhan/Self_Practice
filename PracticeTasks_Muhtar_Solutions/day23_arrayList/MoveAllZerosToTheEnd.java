package PracticeTasks_Muhtar_Solutions.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllZerosToTheEnd {

    public static void main(String[] args) {


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        int a = list1.size();

        list1.removeIf(each -> each == 0);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);

        int b = list2.size();

        int c = a - b ;

        for (int i = 0; i < c ; i++) {

            list2.add(0);
        }


        System.out.println(list2);

    }

}
/*
Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}
            output:
                [1, 2, 3, 4, 0, 0, 0, 0]
 */