package day21_multiDimentionalArray.lessonQS;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int[] array = {10,20,30,40,50,60,70,80};
        int element = 90;

        int[] new_array = Arrays.copyOf(array,array.length +1);

        System.out.println(Arrays.toString(new_array)); // [10, 20, 30, 40, 50, 60, 70, 80, 0]

         new_array[new_array.length-1] = element; // we assigned the element in to new_array

        System.out.println(Arrays.toString(new_array)); // [10, 20, 30, 40, 50, 60, 70, 80, 90]


        System.out.println("----------------------------");

        // with method from ArraysUtility

        int[] numbers = {100,90,80,70,60};

        // 50

        numbers = ArraysUtility.addElement(numbers,50);
        System.out.println(Arrays.toString(numbers)); // [100, 90, 80, 70, 60, 50]

        System.out.println("----------------------------");


        String[] students = {"Yasin","Sumeye","Ermek"};

        students = ArraysUtility.addElement(students,"Hasan Can");

        students = ArraysUtility.addElement(students,"Abidullah");



        System.out.println(Arrays.toString(students)); // [Yasin, Sumeye, Ermek, Hasan Can, Abidullah]



    }

}
