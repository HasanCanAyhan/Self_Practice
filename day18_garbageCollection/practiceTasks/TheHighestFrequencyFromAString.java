package day18_garbageCollection.practiceTasks;

public class TheHighestFrequencyFromAString {


    public static void main(String[] args) { // Task 1

        String str = "aaabbccccddeeee";

        String result = ""; // c e

        int max = 0;


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
                if (count > max) {
                    max = count;
                    result = str.charAt(j) + "";
                }
                if (count >= max && !result.contains(str.charAt(i) + "")) {
                    result += str.charAt(j) + "";
                }
            }
        }
        System.out.println(result);


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