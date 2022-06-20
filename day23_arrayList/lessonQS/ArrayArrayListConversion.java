package day23_arrayList.lessonQS;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {

    public static void main(String[] args) {

        // ARRAY ---->>>> ARRAYLIST

        // with asList() method

        String[] arr = {"A", "B", "C", "D"}; // array is not a collection

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list); // [A, B, C, D]




        /* Advantage of Array
        1) supports primitive and non-primitive type
        2) it can be multi dimensional
        3) in terms of performance, array is fast.
        But size fixed
         */

        /*Advantage of Collection
        1) size dynamic
        2) you can increase - decrease size
        3) give us many methods(ready methods) that we can use
        But support non-primitive, not primitive type
         */

        System.out.println("--------------------------------------------------");

        // ARRAYLIST ---->>>> ARRAY

        // with toArray() method


        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java","Python", "C#"));

        String[] language = list2.toArray(new String[list2.size()]);
        // String[] language = list2.toArray(new String[0]);

        System.out.println(Arrays.toString(language));
        // [Java, Python, C#]


        System.out.println("--------------------------------------------------");


        //         name must be same with Array name
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        //name must be same with ArrayList
        Integer[] n = nums.toArray(new Integer[0]);
        // int [] n = nums.toArray(new Integer[0]); give error!!


        System.out.println(Arrays.toString(n));
        // [1, 2, 3, 4, 5, 6, 7]

    }

}
