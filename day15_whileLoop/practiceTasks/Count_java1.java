package day15_whileLoop.practiceTasks;

public class Count_java1 {

    public static void main(String[] args) {

        // other solution


        String sentence = "My favorite programming language is Java, I love jAva, JAVA is so cool";
        int count = 0;

        for(int i = 0; i < sentence.length(); i++){
            if(i > sentence.length() - 4){
                // ex : sentence.lenght = 70, i must be less than 67
                // because sentence.substring(66,70) will be so, it can not be 71..
                break;
            }else {
                if(sentence.substring(i, i + 4).equalsIgnoreCase("java")){
                    count++;
                }
            }
        }
        System.out.println(count);





        }


    }


/*
1. Write a program that can return the frequency of the word java from a sentence
    Ex:
        sentence = "My favorite programming language is Java, I love jAva, JAVA is so cool"

    output:
        3

 */