package day26_statics.practiceTasks.restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant { // Task 4 continue

    public String owner, location;

    public int numberOfStars;

    public ArrayList<Server> servers = new ArrayList<>();

    public ArrayList<Chef> chefs = new ArrayList<>();


    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        servers.add(server);
        System.out.println(server + " are added to List");

    }

    public void hireServer(Server[] servers){
        this.servers.addAll(Arrays.asList(servers));
        System.out.println(Arrays.toString(servers) + " are added to List");
    }

    public  void hireChef(Chef chef){
        chefs.add(chef);
        System.out.println(chef + " is added to List");
    }

    public  void hireChef(Chef[] chefs){

        this.chefs.addAll(Arrays.asList(chefs));

        System.out.println(Arrays.toString(chefs) + " is added to List");
    }

    public void terminateChef(int employeeID){
        chefs.removeIf(each -> each.employeeID == employeeID);
    }


    public void terminateServer(int employeeID){
        servers.removeIf(each -> each.employeeID == employeeID);
    }


    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers.size() +
                ", chefs=" + chefs.size() +
                '}';
    }
}
