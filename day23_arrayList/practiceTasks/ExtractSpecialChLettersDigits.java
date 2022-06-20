package day23_arrayList.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;


public class ExtractSpecialChLettersDigits { // Task 8

    public static void main(String[] args) {


        String str = "ABCD123$%#@&456EFG!";

        char[] each = str.toCharArray();



        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        ArrayList<Character> list3 = new ArrayList<>();

        for (char eachElement : each) {

            if (Character.isLetter(eachElement)){
                list1.add(eachElement);
            } else if (Character.isDigit(eachElement)) {
                list2.add(eachElement);
            } else if (!Character.isLetterOrDigit(eachElement)) {
                list3.add(eachElement);
            }


        }


        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);

    }

}
/*
8. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */