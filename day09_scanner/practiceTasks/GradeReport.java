package day09_scanner.practiceTasks;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the his/her score : ");

        int score = input.nextInt();

        String result = "";

        if(score >= 0 && score <= 100) {

            if(score >= 90) {
                result = "A";
            }else if (score >= 80 && score < 90) {
                result = "B";
            }else if (score >= 70 && score < 80) {
                result = "C";
            }else if (score >= 60 && score < 70) {
                result = "D";
            }else {
                result = "F";
            }



        }else {
            result = "Invalid score!";
        }


        System.out.println("result : " + result);

        input.close();




    }

}
/*
3. Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */
