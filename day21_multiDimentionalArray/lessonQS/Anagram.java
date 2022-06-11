package day21_multiDimentionalArray.lessonQS;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "level";

        /*
        char[] ch1 =  str1.toCharArray();
        Arrays.sort(ch1);
        System.out.println("ch1 = " + Arrays.toString(ch1));// ch1 = [a, e, h, r, t]

        char[] ch2 =  str2.toCharArray();
        Arrays.sort(ch2);
        System.out.println("ch2 = " + Arrays.toString(ch2));//ch2 = [a, e, h, r, t]


        boolean isAnagram = Arrays.equals(a1,a2);

        System.out.println("isAnagram = " + isAnagram); // true

         */

        // 2. Way with method

        System.out.println(isAnagram(str1,str2));


    }


    public static boolean isAnagram(String str1, String str2){

        char[] ch1 =  str1.toCharArray();
        Arrays.sort(ch1);

        char[] ch2 =  str2.toCharArray();
        Arrays.sort(ch2);

        if (Arrays.equals(ch1,ch2)){
            return true;
        }


        return false;

    }



}
/*

2. Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
                str2 = "earth"

            output:
                true

                str1 = "java"
                str2 = "python"
            output:
                false
 */
