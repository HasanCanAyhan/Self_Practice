package day25_constructor.practiceTasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestMovieObjects {


    public static void main(String[] args) {


        Movie movie1 = new Movie("USA", "Java Developer: Zero to Hero", LocalDate.of(2021, 4, 18), "Kuzzat Altay");

        movie1.casts = new ArrayList<>(Arrays.asList("Ozzy", "Muhtar"));
        movie1.addCast("Lorraine");
        String[] addToCast = {"Rasul", "Hrvoje", "Ali", "Umran", "Oleksiy"};
        movie1.addCasts(addToCast);

        System.out.println(movie1);


    }


}
