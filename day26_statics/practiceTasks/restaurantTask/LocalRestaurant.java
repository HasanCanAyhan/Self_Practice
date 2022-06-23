package day26_statics.practiceTasks.restaurantTask;

import java.time.LocalDate;

public class LocalRestaurant { // Task 4 continue - object part

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Can","Germany-Bensheim",5);


        Server[] servers = {new Server("Can",111,2000,true, LocalDate.of(2022,4,24)),
            new Server("Aras",122,2500,true,LocalDate.of(2022,5,25))};

        restaurant1.hireServer(servers);


        Chef[] chefs = { new Chef("John",125,5,false),
                new Chef("Emir",128,8,true)  };


        restaurant1.hireChef(chefs);


        System.out.println(restaurant1);

        System.out.println("----------------------");

        for (Server eachServer : restaurant1.servers) {
            System.out.println(eachServer.name);

        }

        for (Chef eachChef : restaurant1.chefs) {

            System.out.println(eachChef.name);
        }


    }

}
