package day06_ifStatements;

public class WeekDays {

    public static void main(String[] args) {


        int number = 5; // Assume that a number between 1 ~ 7 is given to the variable

        String nameOfDay = "";

        if(number == 1){
            nameOfDay = "Monday";
        }

        if(number == 2){
            nameOfDay = "Tuesday";
        }

        if(number == 3){
            nameOfDay = "Wednesday";
        }

        if(number == 4){
            nameOfDay = "Thursday";
        }

        if(number == 5){
            nameOfDay = "Friday";
        }

        if(number == 6){
            nameOfDay = "Saturday";
        }

        if(number == 7){
            nameOfDay = "Sunday";
        }

        System.out.println("Your choose is : " + number + ", and the name Of Day = " + nameOfDay);


    }
}
/*
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents

Ex:
Given:
number = 1

output:
Monday

Hint: Assume that a number between 1 ~ 7 is given to the variable
 */