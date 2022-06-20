package day25_constructor.lessonQS;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        /*
        A class that provides the ability to format LocalDate, LocalTime, and LocalDateTime
         */

        /*
        Symbol Meaning -Date Time Formatter
        y: Year of era
        M: Month of year
        d: Day of month
        E: Day of week

        Pattern Meaning -Date Time Formatter

        y 4-digit year number
        yy 2-digit year number
        M Months number
        MM Months number (Includes 0 for number of 0 ~ 9)
        MMM Month abbreviation (Jan, Feb, Mar... etc.)
        MMMM Month name (January, February, March... etc.)
        d Day number
        dd Day number (Includes 0 for number of 0 ~ 9)
        E Day name (Monday, Tuesday... etc.)
        EEEE Days of week abbreviation (Mon, Tue... etc.)

        Symbol Meaning

        H Hour
        h Clock hour
        m Minute
        s Second
        S Nanosecond

        Pattern Meaning

        H 24-hour format
        HH 24-hour format (Includes 0 for number of 0 ~ 9)
        h 12-hour format
        hh 12-hour format (Includes 0 for number of 0 ~ 9)
        m Minute format
        mm Minute format (Includes 0 for number of 0 ~ 9)
        s Second format
        ss Second format (Includes 0 for number of 0 ~ 9)


         */

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd/y EEEE");


        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));


        LocalDate date1 = LocalDate.of(2022,7,1);
        System.out.println(date1.format(df)); // July-01-22


        System.out.println("------------------------------");

        // DateTimeFormatter

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a" );

        LocalTime time1 = LocalTime.of(17,5);

        System.out.println(time1.format(tf)); // 07:05

        System.out.println("------------------------------");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y  hh:mm a");

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf));


        System.out.println("-------------------------------------");

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y  hh:mm a");


        LocalDateTime today1 = LocalDateTime.now();

        System.out.println(today1.format(dtf1));


        System.out.println("-------------------------------------------------");

        // Task01. use the LocalDateTime get the date and time in the following format:
        //            Tuesday, 1:00 pm, Nov/24/2020

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("E, h:mm a, MMM/d/y");


        LocalDateTime myDate = LocalDateTime.of(2020,11,24,1,0);

        System.out.println(myDate.format(dtf2));

    }

}
