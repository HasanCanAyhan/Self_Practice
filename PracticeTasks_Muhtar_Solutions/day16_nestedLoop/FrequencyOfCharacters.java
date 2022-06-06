package PracticeTasks_Muhtar_Solutions.day16_nestedLoop;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabcccd";

        String result = ""; // a2b1c3d1

        for (int i = 0; i < str.length() ; i++) {

            char ch = str.charAt(i); // each character from string
            int count = 0;

            for (int j = 0; j < str.length() ; j++) { //to find the frequency of each character

                char each = str.charAt(j);  // each character of str

                if(ch == each){
                    count++;
                }


            }

            if (!result.contains(""+ch)){
                result += ch + "" + count;
            }
            /*
            or:
             if(result.contains(""+ch)){
                continue;
            }
             */

        }


        System.out.println("result = " + result);




    }

}
/*
Write a program that can find the frequency of the characters from a string
                         Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
            Hint: if you find out how to find the frequency of one character, then repeat it
                    for all the remaining characters
 */