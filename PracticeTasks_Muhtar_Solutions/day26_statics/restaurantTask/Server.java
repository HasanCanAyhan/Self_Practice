package PracticeTasks_Muhtar_Solutions.day26_statics.restaurantTask;

import java.time.LocalDate;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;
    public LocalDate hire_date;

    public Server(String name, int employeeID, double hourlyRate, boolean isFullTime, LocalDate hire_date) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
        this.hire_date = hire_date;
    }

    public void takeOrder(){
        System.out.println(name + " is taking an order");
    }

    public void cleanTable(){
        System.out.println(name + " is cleaning the table");
    }

    public String isFullTime() {

        if(isFullTime){
            return "Full-Time";
        }

        return "Part-Time";
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + isFullTime() +
               // ", isFullTime=" + (isFullTime?"full-time":"Part-time") +
                ", hire_date=" + hire_date +
                '}';
    }
}
/*
 Create a class called Server
	        Attributes:
	                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)
			Add A constructor that can set all the fields
	        Actions: (all void methods)
	            takeOrder(): server's name + "is taking an order"
	            cleanTable(): server's name + "is cleaning the table"
	            toString(): Returns (String) all the information of a Server
	                -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
 */