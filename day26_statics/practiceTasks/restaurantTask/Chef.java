package day26_statics.practiceTasks.restaurantTask;

public class Chef { // Task 4 continue

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;


    public Chef(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }


    public void makeOrder(){
        System.out.println(name + " is making an order");
    }

    public void washDishes(){
        System.out.println(name + " is washing the dishes");
    }

    public String status(){

        if (isFullTime){
            return "Full-Time";
        }else{
            return "Part-Time";
        }

    }


    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + status() +
                '}';
    }
}
