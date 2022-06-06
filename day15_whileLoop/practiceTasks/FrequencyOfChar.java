package day15_whileLoop.practiceTasks;


import java.util.Scanner;

public class FrequencyOfChar { // Task 3

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a string"); // aabcccd
        String str = input.nextLine();

        System.out.println("enter a character");
        char ch = input.next().charAt(0); // c


        int counter = 0;
        for (int i = 0; i < str.length() ; i++) {

            if( str.charAt(i) == ch  ){
                counter +=1;

            }

        }


        System.out.println("result is : "+ counter);

    }

}
/*
3. Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */
