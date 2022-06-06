package day11_string.practiceTasks;

import java.util.Scanner;

public class CombineTwoWords { // Task 6

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first word : ");
        String s1 = input.next();


        System.out.println("Enter the second word : ");
        String s2 = input.next();

        if (s1.charAt(s1.length() -1) == s2.charAt(0)     ){

            String r1 = s1.substring(0,s1.length() -1) + s2;
            System.out.println(r1);


        }


        input.close();


    }

}
/*
6. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight

 */
