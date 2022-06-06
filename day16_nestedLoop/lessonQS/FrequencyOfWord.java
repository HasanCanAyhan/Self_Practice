package day16_nestedLoop.lessonQS;

public class FrequencyOfWord {

    public static void main(String[] args) {


        String str1 = "java JAVA jAvA JAva";
        String word = "java";

        str1 = str1.toLowerCase(); // "java java java java"
        word = word.toLowerCase();// "java"

        int count = 0;

        while( str1.contains(word) ){

            count ++;
            str1 = str1.replaceFirst("java","");

        }

        System.out.println(count);



    }
}
/*
3.  Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4
 */
