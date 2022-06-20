package day24_dateAndTime.lessonQS;

import java.time.LocalTime;

public class LocalTimeIntro {

    public static void main(String[] args) {


        LocalTime starting_time = LocalTime.of(10,30);

        System.out.println(starting_time);

        LocalTime right_now = LocalTime.now();

        System.out.println(right_now);

        System.out.println("---------------------------------------------------------------");

        LocalTime time1 = LocalTime.of(23,59,59);

        System.out.println(time1);

        time1 = time1.plusHours(1);

        System.out.println(time1); // 00:59:59

        time1 = time1.plusMinutes(45);

        System.out.println(time1); // 01:44:59


        boolean r1 = time1.isBefore(  LocalTime.of(2,4,35));
        System.out.println(r1); // true

    }

}
