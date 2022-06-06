package day17_customClass.lessonQS;

public class UniqueCharacters2 {

    public static void main(String[] args) {


        // Different Approach which is Best-Universal Approach

        String str = "aabcccd";

        String unique = "";

        for (int j = 0; j < str.length() ; j++) {
            char ch = str.charAt(j);
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }


            if (frequency == 1) { // if the frequency is one , then it´s unique
                unique += ch;
            }

        }


        System.out.println(unique);

    }

}
/*

Warmup Tasks:
	1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */