package PracticeTasks_Muhtar_Solutions.day18_extraPractices;

import java.util.Arrays;
import java.util.Collections;

public class HighestFrequency {

    public static void main(String[] args) {

        // This part to find what the highestFrequency is.

        String str = "aaabbccccddeeee";

        int highestFrequency = 0; // At the End it will be 4

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (ch == str.charAt(j)) {
                    count++;
                }

            }

            if (count > highestFrequency) {
                highestFrequency = count;
            }

        }

        System.out.println(highestFrequency);// 4

        System.out.println("------------------------------");

        // This part to find if the frequency of character equals to highestFrequency . If it equals , add it to result.

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (ch == str.charAt(j)) {
                    count++;
                }

            }


            if (count == highestFrequency && !result.contains(ch + "")) {
                result += ch;
            }

        }

        System.out.println(result); // c e

    }
}
/*
1. Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"
		output:
			c
			e
 */