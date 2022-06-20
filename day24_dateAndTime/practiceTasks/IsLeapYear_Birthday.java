package day24_dateAndTime.practiceTasks;

import java.time.LocalDate;

public class IsLeapYear_Birthday { // Task 8

    public static void main(String[] args) {


        System.out.println(isLeapYearOfBirthYear(2016));



    }

    public static boolean isLeapYearOfBirthYear(int birthYear){


        LocalDate birthday = LocalDate.of(birthYear,1,1);

        return birthday.isLeapYear();



    }

}
/*
8. Create a function that accepts an int argument birthYear,
return true if the person was born on leap year, otherwise return false
 */