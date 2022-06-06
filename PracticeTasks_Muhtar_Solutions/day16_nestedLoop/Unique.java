package PracticeTasks_Muhtar_Solutions.day16_nestedLoop;

public class Unique {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = ""; //bdf

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); //'a'

            int count = 0; // represents the frequency of the ch

            for (int j = 0; j < str.length() ; j++) {  //compares the character that outer loop picked, with each character of the string,

                char each = str.charAt(j); // each character of str

                if(ch == each){
                    count++;
                }
            }

            /*
            if(count ==  1){ // if the frequency of the character is 1, then the character is unique
                result += ch;
            }
             */

            if (count !=1){
                continue;
            }

            result += ch;

        }


        System.out.println("result = " + result);

    }

}
/*
 Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods
                        Ex:
                        str = "aabccdeef";
                        output:
                                bdf
            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
                        if frequency of a character == 1  =========> unique
 */