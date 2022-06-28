package PracticeTasks_Muhtar_Solutions.day25_constructors.movieTask;

import java.time.LocalDate;

public class TestMovieObject {

    public static void main(String[] args) {


        String genre = "Adventure, Comedy, Thriller";
        String title = "Java Developer: Zero to Hero";
        String[] casts = {"Ozzy", "Ali", "Muhtar", "Akbar", "Gurhan", "Saim", "Murodil", "Nadir", "Guljannet"};


        Movie movie1 = new Movie("USA", title, genre,"Kuzzat Altay",LocalDate.of(2022,4,18) );

        movie1.addCast("Can"); // String name

        movie1.addCasts(casts); // String[] names - Array

        System.out.println(movie1);

    }


}
