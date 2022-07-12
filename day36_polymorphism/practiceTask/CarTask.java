package day36_polymorphism.practiceTask;



import day34_abstraction.lessonQS.carTask.Audi;
import day34_abstraction.lessonQS.carTask.Car;
import day34_abstraction.lessonQS.carTask.Honda;
import day34_abstraction.lessonQS.carTask.Tesla;

import java.util.ArrayList;

public class CarTask {

    public static void main(String[] args) {

        Car[] cars = {
                new Honda("Pilot","White", 2010, 25000),
                new Audi("Q6", "Red",2014, 32000),
                new Honda("Accord", "White",2011, 20000  ),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black",2019, 35000),
                new Audi("Q8", "White",2018, 40000),
                new Audi("Q5", "Purple",2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red",2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue",2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue",2014, 48000),
        };


        for (Car each : cars) {


            if (each instanceof Honda){
                if (each.getYear() >= 2010 && each.getYear() <= 2011){
                    System.out.println(each);
                }
            } else if (each instanceof Audi) {
                if (each.getYear() >= 2015 && each.getYear() <= 2019){
                    System.out.println(each);
                }
            }else{
                if (each.getYear() >= 2015 && each.getYear() <= 2016){
                    System.out.println(each);
                }
            }


        }

        System.out.println("------------------------------------------------");

        //	1.3 Write a program that can display the car that has the highest price
        //  1.4 Write a program that can display the car that has the lowest price

        /* ANOTHER SOLUTION :

          //Highest and lowest Price

        ArrayList<Integer> priceList = new ArrayList<>();
        for(Car each: cars){
            priceList.add(each.getPrice());
        }
        System.out.println(Collections.max(priceList));
        System.out.println(Collections.min(priceList));
         */



        /* ANOTHER SOLUTION 2:

         System.out.println("________________________________________________");

        // Display the car that has highestPrice
        ArrayList<Double> priceList = new ArrayList<>();
        for (Car each : cars) {
            priceList.add(each.getPrice());
        }
        ArrayList<Car> highestPriceCar = new ArrayList<>();
        for (Car each : cars) {
            if(each.getPrice()==Collections.max(priceList)){
                highestPriceCar.add(each);
            }
        }
        System.out.println("highest price car: "+highestPriceCar);

        //Display the lowest price car
        ArrayList<Car> lowestPriceCar = new ArrayList<>();
        for (Car each : cars) {
            if(each.getPrice()==Collections.min(priceList)){
                lowestPriceCar.add(each);
            }
        }
        System.out.println("Lowest price car: "+ lowestPriceCar);

        System.out.println("____________________________________________________");
         */

        double maxCarPrice = Integer.MIN_VALUE;
        double minCarPrice = Integer.MAX_VALUE;

        for (int i = 0; i < cars.length; i++) {

            if (cars[i].getPrice() > maxCarPrice){
                maxCarPrice = cars[i].getPrice();

            }

            if (cars[i].getPrice() < minCarPrice){
                minCarPrice = cars[i].getPrice();
            }


        }


        System.out.println("maxCarPrice = " + maxCarPrice);
        System.out.println("minCarPrice = " + minCarPrice);

        for (Car each : cars) {

            if (each.getPrice() == maxCarPrice){
                System.out.println(each);
            }

            if (each.getPrice() == minCarPrice){
                System.out.println(each);
            }

        }

        System.out.println("-------------------------------------------------");

        // 1.4 Create an arraylist of Tesla named teslaCars and store all the tesla cars from cars array to the arrayList:

        ArrayList<Tesla> teslaCars = new ArrayList<>();// The Type of ArraysList is Tesla not Car!!!!

        for (Car carObject : cars) {

            if (carObject instanceof Tesla){
                teslaCars.add( (Tesla)carObject);
            }

        }

        System.out.println("teslaCars = " + teslaCars);
        System.out.println("teslaCars = " + teslaCars.size());


    }




}
/*
Given the following array that contains the car objects:
				 Car[] cars = {
                new Honda("Pilot","White", 2010, 25000),
                new Audi("Q6", "Red",2014, 32000),
                new Honda("Accord", "White",2011, 20000  ),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black",2019, 35000),
                new Audi("Q8", "White",2018, 40000),
                new Audi("Q5", "Purple",2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red",2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue",2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue",2014, 48000),
        };

		        (import them from day34 package)


	        1.2 Write a program that can display all the cars that are eligible for recall

	        					Cars that are eligible for recall:
	        							Honda: from year 2010 to 2011
	        							Audi: from year 2015 to 2019
	        							Tesla: from year 2015-2016

			1.3 Write a program that can display the car that has the highest price

			1.3 Write a program that can display the car that has the lowest price

			1.4 Create an arraylist of Tesla named teslaCars and store all the tesla cars from cars array to the arrayList:
						ArrayList<Tesla> teslaCars = new ArrayList<>()
 */