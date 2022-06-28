package day28_encapsulation.practiceTasks;

public class Pizza { // Task 4

    private String size;
    private int numberOfCheeseTopping,  numberOfPepperoniTopping;


    public String getSize() {
        return size;
    }

    public void setSize(String size) {

        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large") )){
            System.err.println("size of the pizza can only be small, medium, large:" +size );
            System.exit(1);
        }

        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {

        if (numberOfCheeseTopping < 0  ){
            System.err.println(" Number of cheese topping can not be negative: " + numberOfCheeseTopping);
            System.exit(1);
        }

        if (size.equalsIgnoreCase("small") && numberOfCheeseTopping >= 4){
            System.err.println(" the maximum number of small cheese topping is: " + 3);
            System.exit(1);
        } else if (size.equalsIgnoreCase("medium") && numberOfCheeseTopping >= 5) {
            System.err.println(" the maximum number of medium cheese topping is: " + 4);
            System.exit(1);
        } else if (size.equalsIgnoreCase("large") && numberOfCheeseTopping >= 6) {
            System.err.println(" the maximum number of large cheese topping is: " + 5);
            System.exit(1);
        }


        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {

        if (numberOfPepperoniTopping < 0  ){
            System.err.println(" Number of pepperoni topping can not be negative: " + numberOfPepperoniTopping);
            System.exit(1);
        }

        if (size.equalsIgnoreCase("small") && numberOfPepperoniTopping >= 5){
            System.err.println(" the maximum number of small pepperoni topping is: " + 4);
            System.exit(1);
        } else if (size.equalsIgnoreCase("medium") && numberOfPepperoniTopping >= 6) {
            System.err.println(" the maximum number of medium pepperoni topping is: " + 5);
            System.exit(1);
        } else if (size.equalsIgnoreCase("large") && numberOfPepperoniTopping >= 7) {
            System.err.println(" the maximum number of large pepperoni topping is: " + 6);
            System.exit(1);
        }


        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public int calcCost(){

        int total = 2 * (numberOfCheeseTopping+numberOfPepperoniTopping);

        return (size.equalsIgnoreCase("small"))? total+10 : (size.equalsIgnoreCase("medium")) ? total+12 : total+14;

    }


    public String toString() {
        return "Pizza{" +
                "size='" + getSize() + '\'' +
                ", numberOfCheeseTopping=" + getNumberOfCheeseTopping() +
                ", numberOfPepperoniTopping=" + getNumberOfPepperoniTopping() +
                ", total cost= $" + calcCost() +
                '}';
    }



}
/*
4. Create class named Pizza:
                private variables:
                    size, numberOfCheeseTopping, numberOfPepperoniTopping

                Encapsulate all the fields
                        Conditions:
                            size of the pizza can only be small, medium, large. case insensitive

                            Number of cheese topping can not be negative, the maximum number of cheese topping is:
                                        small: 3
                                        medium: 4
                                        large: 5

                            Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

                                        small: 4
                                        medium: 5
                                        large: 6

                Add a constructor that allows user to set all the fields when the object is created.
                                (If the arguments not valid it should not be set to the instances)


                Methods:
                    calcCost(): returns the totalCost of the pizza
                    toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
 */