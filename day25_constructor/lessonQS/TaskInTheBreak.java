package day25_constructor.lessonQS;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;

public class TaskInTheBreak {

    public static void main(String[] args) {

        // 1qs
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/d/y");

        LocalDateTime dt = LocalDateTime.of(2020,11,24,13,0);

        System.out.println(dtf.format(dt));

        System.out.println("---------------------------------------------------------");

        // 2qs
        String[] names = {"Boban ", "Hasan", "Yasemin","Florya","Sam"};

        LocalDate[] birthdays = { LocalDate.of(1994 , 5,24),
                LocalDate.of(1995,3,24),
                LocalDate.of(1993,6,22),
                LocalDate.of(1992,7,20),
                LocalDate.of(1989,4,25)};


        int youngest = birthdays[0].getYear();

        String result = "";

        for (int i = 0; i < birthdays.length; i++) {

            if(birthdays[i].getYear() > youngest ){
                youngest = birthdays[i].getYear();
                result = names[i];
            }

        }

        System.out.println(result);

        System.out.println("----------------------");

        // 3qs

        for (int i = 0; i < birthdays.length; i++) {

            if(birthdays[i].isLeapYear()){
                System.out.println(names[i]);
            }

        }


        System.out.println("--------------------------------------------------");

        // Another Solution by using Collections.max() method

        LocalDate max = Collections.max(Arrays.asList(birthdays));

        for (int i = 0; i < birthdays.length; i++) {

            if(birthdays[i] == max){
                System.out.println(names[i] + " is youngest");
            }
            if(birthdays[i].isLeapYear()){
                System.out.println(names[i]+ " was born during a leap year");
            }


        }




    }

}
/*
        Task01. use the LocalDateTime get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
Task02:
    1. create string array to have 5 of your classmate's names

    2. create an array that contains their date of birth

    3. find out who is the youngest person

    4. find out who was born on leap year
*/

