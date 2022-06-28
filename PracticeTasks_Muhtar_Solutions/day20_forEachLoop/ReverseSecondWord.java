package PracticeTasks_Muhtar_Solutions.day20_forEachLoop;

public class ReverseSecondWord {

    public static void main(String[] args) {


        String str = "I Love Java";

        String[] str_arr = str.split(" ");

        String result = "";


        for (int i = 0; i < str_arr.length; i++) {

            if(i == 1){

                String word = str_arr[i]; // Love

                for (int j = word.length() -1 ; j >= 0 ; j--) {

                    result += word.charAt(j); // evoL
                }

                result += " ";

            }else{
                result += str_arr[i] + " ";
            }


        }

        System.out.println(result);





    }

}
/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";
            output:
                I evoL Java
 */