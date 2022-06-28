package day28_encapsulation.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory { // Task 5

    public static void main(String[] args) {


        ArrayList<Candy> candies = new ArrayList<>();

        Candy candy1 = new Candy("haribo", 2, 0, false);

        Candy candy2 = new Candy("M&M", 3, 5, true);
        Candy candy3 = new Candy("twizzlers", 2, 3, true);
        Candy candy4 = new Candy("skittles", 6, 6, false);
        Candy candy5 = new Candy("topitop", 5, 5, false);


        candies.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        System.out.println(candies);

        for (Candy each : candies) {

            System.out.println(  each.getBrand()  + " " + each.getPrice() );

        }


    }

}
/*
  5.1 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
 */