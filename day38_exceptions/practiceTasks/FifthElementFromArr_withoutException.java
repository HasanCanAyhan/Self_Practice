package day38_exceptions.practiceTasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FifthElementFromArr_withoutException {

    public static void main(String[] args) {

        //1. Write a program that can return the fifth element from an array
        //       note: avoid getting any exceptions

        Integer[] arr = {1,2,3,4,5};  // 5.element -->> index = 4


        try {
            System.out.println(Array.get(arr,4));
        }catch (RuntimeException e){
            System.out.println(arr[arr.length - 1] + ": object in the last index " + (arr.length - 1));
            e.printStackTrace();
        }



    }

}
