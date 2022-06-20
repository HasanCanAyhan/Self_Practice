package day24_dateAndTime.lessonQS;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {


        /*
        Java Date and Time

        -immutable : object does not change
        -presented in java.time package

        -1)LocalDate
        -2)LocalTime
        -3)LocalDateTime
        -4)DateTimeFormatter

         */


        // 1) Local Date

        // LocalDate today = LocalDate.now();

        // LocalDate birthday = LocalDate.of();

        LocalDate today = LocalDate.now();
        System.out.println(today); // 2022-06-18

        System.out.println("-----------------------------------------");

        LocalDate birthday = LocalDate.of(1995,3,24);
        System.out.println(birthday); // 1995-03-24

        System.out.println("-----------------------------------------");

        // METHODS OF LOCAL DATE OBJECT

        // After creating object , you can able to use Methods of LocalDate Object

        System.out.println(  today.getYear()  ) ; // 2022
        System.out.println(  today.getMonth()  ); // The Name of month - JUNE
        System.out.println(  today.getMonthValue() ); // 6
        System.out.println(  today.getDayOfWeek() ); // SATURDAY
        System.out.println(  today.getDayOfMonth()); // 18
        System.out.println(  today.getDayOfYear()); // today is 169.day of the year

        System.out.println(  birthday.getDayOfWeek() ); // FRIDAY


        System.out.println("-------------------------------------------------------");

        today = today.plusYears(1); // you should assign again, because this object immutable
        System.out.println(today); // 2023-06-18


        System.out.println("----------------------------------------------------------");

        // Plus

        LocalDate graduationDate = LocalDate.of(2025,6,4);

        graduationDate = graduationDate.plusYears(2); // 2027-06-04
        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);
        System.out.println(graduationDate); // 2028-01-04

        graduationDate = graduationDate.plusWeeks(7);
        System.out.println(graduationDate); // 2028-02-22

        graduationDate = graduationDate.plusDays(100);
        System.out.println(graduationDate); // 2028-06-01

        System.out.println("---------------------------------------------------------");

        //Minus

        LocalDate yourBirthDay = LocalDate.of(2005,4,1);

        LocalDate yourBrotherBirthday = yourBirthDay.minusYears(2).minusMonths(3);

        System.out.println(yourBirthDay); // 2005-04-01
        System.out.println(yourBrotherBirthday); // 2003-01-01

        System.out.println("-------------------------------------------------------------");

        LocalDate birthday1 = LocalDate.of(1994,7,7);
        LocalDate birthday2 = LocalDate.of(1995,6,7);

        boolean r1 = birthday1.isEqual(birthday2);
        System.out.println(r1); // false

        System.out.println("-------------------------------------------------------------");

        LocalDate grad_date = LocalDate.of(2023,1,1);

        System.out.println(grad_date.isBefore(LocalDate.of(2022,12,31)  )); // false
        System.out.println(grad_date.isAfter(LocalDate.of(2022,12,31)  )); // true

        System.out.println("---------------------------------------");
        // isLeapYear();

        System.out.println( LocalDate.of(1995,3,24).isLeapYear()    ); // false



    }

}
