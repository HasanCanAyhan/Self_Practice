package day23_arrayList.lessonQS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {


             /*

        Collections : Utility class of the Collection.
                      presented in "java.util" package

            methods:

            sort(list) : sorts the list in ascending order
            max(list) : returns the max number
            min(list) : returns the min number
            reverse(list) : reverses the list
            swap(list1,index1,index2) : swaps the elements at the given indexes
            frequency(list, element) : returns the frequency of the element from the list


         */


        //max(list) : returns the max number
        //min(list) : returns the min number

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8));

        int max = Collections.max(list); // max method static that´s why we called it through Class.name
        System.out.println(max); // 8

        int min = Collections.min(list);
        System.out.println(min); // 1


        System.out.println("---------------------------------------------------------");


        // we used it from Array Utility Class it is only for Array

        // sort(list) : sorts the list in ascending order

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towels"));

        Collections.sort(items);

        System.out.println(items); // Ascii Table
        // [Blueberry, Eggs, Milk, Orange, Paper towels, Potato, Rice, Strawberry, Tomato]


        System.out.println("----------------------------------------------------------");

        //    reverse(list) : reverses the list


        Collections.reverse(items);
        System.out.println(items);
        // [Tomato, Strawberry, Rice, Potato, Paper towels, Orange, Milk, Eggs, Blueberry]


        System.out.println("----------------------------------------------------------");


        //  swap(list1,index1,index2) : swaps the elements at the given indexes


        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal"));


        Collections.swap(students,0,1);
        System.out.println(students); // [Hasan, Gadir, Abidullah, Bilal]


        Collections.swap(students,0,students.size()-1);
        System.out.println(students); // [Bilal, Gadir, Abidullah, Hasan]



    }


}
