package day06_ifStatements;

public class MonthName {

    public static void main(String[] args) {


        int number = 10;

        String nameOfMonth = "";

        if(number == 1){
            nameOfMonth = "January";
        }

        if(number == 2){
            nameOfMonth = "February";
        }

        if(number == 3){
            nameOfMonth = "March";
        }

        if(number == 4){
            nameOfMonth = "April";
        }

        if(number == 5){
            nameOfMonth = "May";
        }

        if(number == 6){
            nameOfMonth = "June";
        }

        if(number == 7){
            nameOfMonth = "July";
        }

        if(number == 8){
            nameOfMonth = "August";
        }

        if(number == 9){
            nameOfMonth = "September";
        }

        if(number == 10){
            nameOfMonth = "October";
        }

        if(number == 11){
            nameOfMonth = "November";
        }

        if(number == 12){
            nameOfMonth = "December";
        }

        System.out.println("nameOfMonth = " + nameOfMonth);



    }


}
/*
1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents

Ex:
Given:
number = 10

output:
October
 */