package day25_constructor.lessonQS;

import java.time.LocalDateTime;

public class LocalDateTimeIntro {

    public static void main(String[] args) {

        /*
        A class that provides the ability to use years, months, days, hours, minutes,
        seconds and nanoseconds to represent times numerically
         */


        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts);

        LocalDateTime ends = LocalDateTime.of(2023,5,25,11,0);

        System.out.println(ends); // 2023-05-25T11:00

        System.out.println(starts.getDayOfWeek()); // SATURDAY

        System.out.println(starts.getHour()); // h:  17

        System.out.println(ends.getDayOfWeek()); // THURSDAY

        System.out.println(ends.getHour()); // h: 11


    }

}
