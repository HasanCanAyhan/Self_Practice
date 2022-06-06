package day16_nestedLoop.practiceTasks;

public class UniqueCharacterFromAString { // Task 10

    public static void main(String[] args) {



        String str = "aabccdeef";

        String result = "";

        for (int i = 0; i < str.length() ; i++) {

            char eachCh = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length() ; j++) {

                if (   str.substring(j,(j+1)).equals(""+eachCh)   ){
                    count++;
                }

            }

            if( count == 1 ){
                result += eachCh;
            }

        }


        System.out.println("Unique Characters from the given string : " + result);

    }

}
/*
10. Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

                        Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
 */
