package PracticeTasks_Muhtar_Solutions.day25_constructors.movieTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country, title, genre , director;

    public LocalDate releaseDate;

    public ArrayList<String> casts = new ArrayList<>();

    public Movie(String country, String title, String genre, String director, LocalDate releaseDate) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
    }

    public void addCast(String name ){

        casts.add(name);
        System.out.println(name + " is added to list");

    }

    public void addCasts(String[] names){

        casts.addAll(Arrays.asList(names));


    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", releaseDate=" + releaseDate +
                ", total number of casts=" + casts.size() +
                '}';
    }


}
/*
Movie Task:
	3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)
		Add a constructor to set the country, title, release date, and director of the Movie
	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts
 */