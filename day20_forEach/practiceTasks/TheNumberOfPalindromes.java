package day20_forEach.practiceTasks;

import utilities.StringUtility;

public class TheNumberOfPalindromes { // Task 4

    public static void main(String[] args) {


        /* Another Solution 1
        String[] words = {"anna", "level", "Java","lol"};

        int countPalindromes = 0;

        for (String each : words) {

            String result = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                result += each.charAt(i);
            }

            if (each.equals(result)) {
                countPalindromes++;
            }
        }

        System.out.println(countPalindromes);
         */


        String[] arr = {"anna", "level", "Java"};

        // String arr_reversed = StringUtility.reverse(arr[0]);

        int count = 0;

        for (String each : arr) {

            for (int i = 0; i < arr.length; i++) {

                if (each.equals(StringUtility.reverse(arr[i]))) {
                    count++;
                }

            }


        }

        System.out.println("count = " + count); // count : 2



    }

}
/*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */