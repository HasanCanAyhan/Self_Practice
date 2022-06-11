package day20_forEach.lessonQS;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        /*
        STRING METHODS :
            toCharArray(): returns char array;
            split(): returns String array;
         */

        // TO CHAR METHOD

        String str = "Cydeo School";

        char[] strChar = str.toCharArray();

        System.out.println("strChar = " + Arrays.toString(strChar)); // strChar = [C, y, d, e, o,  , S, c, h, o, o, l]

        System.out.println("---------------------");

        char[] ch = str.replace(" ", "").toCharArray();

        System.out.println("ch = " + Arrays.toString(ch)); // ch = [C, y, d, e, o, S, c, h, o, o, l]

        System.out.println("--------------------------------------------------------------");

        // SPLIT METHOD :   returns String Array from the given String.

        String str2 = "Today is a great day to learn java";

        String[] words = str2.split(" ");

        System.out.println("words = " + Arrays.toString(words));
        // words = [Today, is, a, great, day, to, learn, java]


        System.out.println("--------------------------------------------------------------");

        String sentence = "I love Java";

        // Java love I

        // 1. convert the String to String Array
        String[] word = sentence.split(" "); // [I, love, Java]

        // 2. StringArray must be reversed.
        String[] reversed_array = ArraysUtility.reverse(word);

        System.out.println("reversed_array = " + Arrays.toString(reversed_array)); // reversed_array = [Java, love, I] as a String array

        // 3. in order to get a reversed String from the reversed String Array, you can get the elements  index by index, and then collect inside the String reversedSentence
        String reversedSentence = "";

        for (int i = 0; i < reversed_array.length; i++) {

            reversedSentence += reversed_array[i]+ " ";

        }

        System.out.println("reversedSentence = " + reversedSentence); // Java love I  as a String

    }


}
