package day07_ifStatements.practiceTasks;

public class Grade {

    public static void main(String[] args) {

        char grade = 'B';

        String result = "";

        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F'){

            if (grade == 'A'){
                result = "Excellent";
            } else if (grade == 'B') {
                result = "Great Job";
            }else if (grade == 'C'){
                result = "Good";
            } else if (grade == 'D') {
                result = "Passed";
            }else if (grade == 'F'){
                result = "Failed";
            }

        }else{
            result = "INVALID !";
        }

        System.out.println(result);

    }

}
/*
4. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */