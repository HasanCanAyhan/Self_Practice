package day07_ifStatements.practiceTasks;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 56;

        String ageGroups = "";

        if (age >= 0 && age < 150){

            if (age <= 20){
                ageGroups = "Teenager";
            } else if (age <= 55 ) {
                ageGroups = "Adult";
            }else {
                ageGroups = "Senior";
            }

        }else{
            ageGroups = "INVALID !";
        }

        System.out.println(ageGroups);


    }
}
/*
5. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */