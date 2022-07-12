package day37_exceptions;

public class Pizza {

    private char size;
    private int  numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){ // Check if calcCost Method will contain any parameter or not, in this situation, we dont need to write any parameter.
        double totalPrice = 0;

        switch(size){ // if you want , you can write also "this.size"

            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            default:
                System.err.println("Invalid size: " + size);


        }

        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price=" + calcCost() +
                '}';
    }

    @Override
    public boolean equals(Object obj) { // Runtime Polymorphism

        //instanceof : determine object type

        if (! (obj instanceof Pizza)){ // if the specified object is not pizza
            System.err.println("Invalid object: " + obj);
            System.exit(1);
        }

        Pizza pizza = (Pizza) obj; // it is referencing same object

        // or :  ((Pizza)obj).size... // down casting
        if (size == pizza.getSize()){ // size there is no inside Object Type, there is in the Pizza Class
            if (numberOfPepperoniTopping == pizza.getNumberOfPepperoniTopping()){
                return true;
            }
        }

        return false;

    }




}
/*
warmup tasks:
	1. Create a class named Pizza
			variables:
				size (char), numberOfCheeseTopping, numberOfPepperoniTopping

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				calcCost(): returns the total cost of the pizza

			Override toString method to print Pizza object info when the object is passed in the print statement

			Override equals method that returns true if the pizza object is equal to the specified pizza object
 */