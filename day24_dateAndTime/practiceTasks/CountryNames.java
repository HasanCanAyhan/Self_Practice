package day24_dateAndTime.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryNames { // Task 6

    public static void main(String[] args) {


        ArrayList<String> countryNames = new ArrayList<>();
        countryNames.addAll(Arrays.asList("Mozambique", "France","Germany","Turkey","England","United States"));

        countryNames.removeIf(each -> each.length() >= 10);

        System.out.println(countryNames);// [France, Germany, Turkey, England]



    }

}
/*
6. Create an ArrayList of string called country names, write a program
that can remove all the country names that have length of 10 or greater
 */