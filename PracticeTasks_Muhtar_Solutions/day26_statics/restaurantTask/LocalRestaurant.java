package PracticeTasks_Muhtar_Solutions.day26_statics.restaurantTask;

import java.time.LocalDate;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant localRestaurant = new Restaurant("Can","Germany",5);

        Server[] myServers = {new Server("Can",123,45,true, LocalDate.of(2022,5,24)),
                            new Server("Ermek",122,48,false,LocalDate.of(2022,01,24))};

        localRestaurant.hireServer(myServers);

        Chef[] myChefs = {new Chef("Josh",101,48,true),
                          new Chef("Kim",121,48,true)};

        localRestaurant.hireChef(myChefs);

        System.out.println(localRestaurant);

        for (Server myEachServer : localRestaurant.servers) {

            System.out.println(myEachServer.name);

        }

        for (Chef myEachChef : localRestaurant.chefs) {
            System.out.println(myEachChef.name);
        }

        System.out.println("-------------------------------");

        System.out.println( localRestaurant.owner);
        System.out.println( localRestaurant.numberOfStars);
        System.out.println( localRestaurant.location);

        System.out.println("----------------------------------");
        System.out.println(localRestaurant.chefs);
        System.out.println("----------------------------------");
        System.out.println(localRestaurant.servers);






    }




}
/*
4.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */