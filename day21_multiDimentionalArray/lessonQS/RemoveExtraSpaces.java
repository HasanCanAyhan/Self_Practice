package day21_multiDimentionalArray.lessonQS;

import java.util.Arrays;

public class RemoveExtraSpaces {

    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java    ";

        // output : Hello world I love Java

        str =  str.trim();

        String[] words = str.split(" ");

        System.out.println("words = " + Arrays.toString(words));
        // words = [Hello, world, , , , , , I, , , , , , love, , , , , , Java]


        str = "";

        for (String each : words) {

            if(!each.isEmpty()){
                str += each+" ";

            }
        }

        str = str.trim();  // to remove the last space

        System.out.println("str = " + str); //  Hello world I love Java



    }

}
/*
Warmup tasks:
	1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java
 */