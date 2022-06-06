package day17_customClass.lessonQS;

public class FrequencyOfCharacters {

    public static void main(String[] args) {


        String  str = "aabcccd";

        String result = ""; // result = a2b1c3d1

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            int frequency = 0;
            for (int j = 0; j < str.length() ; j++) {


                if(each == str.charAt(j)){
                    frequency++;
                }

            }
            /*

            if(!result.contains(""+each)){
                result += ""+each+frequency;
            }

             */

            if (result.contains(""+each)){ // if the character is already included in the result
                continue;// skip that character
            }

            result += each + "" + frequency;

        }


        System.out.println("result = " + result);


    }

}
/*
2. Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */