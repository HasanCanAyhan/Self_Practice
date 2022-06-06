package day16_nestedLoop.practiceTasks;

import java.util.Scanner;

public class Grade { // Task 7

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (; ; ) {

            System.out.println("Enter your score:");
            int score = input.nextInt();

            if (score < 0 || score > 100) {
                System.err.println("Invalid Entry!");
                System.exit(1);
            }

            String result = "Your grade is ";


            if (score >= 90) {
                result += "A";
            } else if (score >= 80) {
                result += "B";
            } else if (score >= 70) {
                result += "C";
            } else if (score >= 60) {
                result += "D";
            } else {
                result += "F";
            }

            System.out.println(result);


            System.out.println("Would you like to continue? Yes / No");
            String answer = input.next();

            while (!(answer.equals("yes") || answer.equals("no"))) {

                System.err.println("Invalid Entry! Please re-enter your answer:");
                answer = input.next().toLowerCase();

            }

            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                break;
            }

        }


    }

}
/*
7. Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program
 */