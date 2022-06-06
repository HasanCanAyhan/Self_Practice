package day07_ifStatements;

public class WeekDays2 {

    public static void main(String[] args) {

        int day = 10;

        String result = "Today is ";

        if (day >= 1 && day <= 7){

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

        }else{
            result = "Invalid value";
        }

        System.out.println(result);

    }
}
/*
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents.
(only if the given number is a valid number, then print the name of the
day. Otherwise print Invalid)

Ex:
Given:

number = 1

output:

Monday
 */
