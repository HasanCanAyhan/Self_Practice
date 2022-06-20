package day25_constructor.practiceTasks;

public class Pizza { // Task 1


    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;


    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public int calcCost(){

        return (size.equalsIgnoreCase("s"))? 10 + 2 *(numberOfCheeseTopping + numberOfPepperoniTopping)
                :(size.equalsIgnoreCase("m"))? 12 + 2 * (numberOfPepperoniTopping+numberOfCheeseTopping)
                : 14 + 2 * (numberOfPepperoniTopping + numberOfCheeseTopping);

    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total cost=" + calcCost() +
                '}';
    }
}
/*
Task01:
    Create a custom class named Pizza:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */
