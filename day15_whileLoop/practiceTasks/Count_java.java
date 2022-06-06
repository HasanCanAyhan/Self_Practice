package day15_whileLoop.practiceTasks;

public class Count_java { // Bonuses 1

    public static void main(String[] args) {


        String str = "My favorite programming language is Java, I love jAva, JAVA is so cool";

        str = str.toLowerCase();

        String str1 = "java";




        int i = 0;
            while(str.contains(str1)){

                str =  str.replaceFirst("java", "Python");

                i++;
            }
        System.out.println(i);

    }


}
/*
1. Write a program that can return the frequency of the word java from a sentence
    Ex:
        sentence = "My favorite programming language is Java, I love jAva, JAVA is so cool"

    output:
        3

 */