package day16_nestedLoop.practiceTasks;

public class FrequencyFromAString { // Task 9

    public static void main(String[] args) {



        String str = "aabcccd";

        String result = "";


        for (int j = 0; j < str.length() ; j++) {

            char ch =  str.charAt(j);

            int count = 0;
            for (int i = 0; i < str.length() ; i++) {

                if(str.substring(i,(i+1)).equals(""+ch)){
                    count++;
                }

            }

            if (!result.contains(""+ch)){
                result += ch + "" + count;
            }


        }



        System.out.println("result = " + result);




    }

}
/*

9. Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters

 */