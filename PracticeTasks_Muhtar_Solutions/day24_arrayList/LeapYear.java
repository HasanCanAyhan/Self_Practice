package PracticeTasks_Muhtar_Solutions.day24_arrayList;

import java.time.LocalDate;

public class LeapYear {

    public static void main(String[] args) {

        System.out.println( isLeapYear(2016) );

    }

    public static boolean isLeapYear(int birthday){

        LocalDate yourBirthday = LocalDate.of(birthday,1,1);

        return (yourBirthday.isLeapYear());

    }

}
/*
8. Create a function that accepts an int argument birthYear,
return true if the person was born on leap year, otherwise return false
 */