package day07_ifStatements;

public class WeekDays {

    public static void main(String[] args) {

       int day = 1; // Note: Assume that the given number is between 1 ~ 7

       String result = "Today is ";

        if (day == 1) {
            result += "Monday";
        } else if (day == 2) {
            result += "Tuesday";
        } else if (day == 3) {
            result += "Wednesday";
        } else if (day == 4) {
            result += "Thursday";
        } else if (day == 5) {
            result += "Friday";
        } else if (day == 6) {
            result += "Saturday";
        } else if (day == 7) {
            result += "Sunday";
        }

        System.out.println(result);

    }
}
/*
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents.

Ex:
Given:

number = 1

output:

Monday

Note: Assume that the given number is between 1 ~ 7
 */