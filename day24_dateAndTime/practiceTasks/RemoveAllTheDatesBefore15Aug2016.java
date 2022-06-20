package day24_dateAndTime.practiceTasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllTheDatesBefore15Aug2016 { // Task 9

    public static void main(String[] args) {


        ArrayList<LocalDate> dates = new ArrayList<>();
        dates.addAll(Arrays.asList(LocalDate.of(2016, 3, 3), LocalDate.of(2019, 7, 18), LocalDate.of(2022, 6, 16)));

        dates.removeIf(each -> each.isBefore(LocalDate.of(2016,8,15)) );

        System.out.println(dates); // [2019-07-18, 2022-06-16]


    }

}
/*
9. create an Arraylist of LocalDate,
 write a program that can remove all the dates before August-15-2016
 */
