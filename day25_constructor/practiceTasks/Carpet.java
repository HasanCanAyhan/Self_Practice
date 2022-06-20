package day25_constructor.practiceTasks;

public class Carpet { // Task 3

   public double width;
   public double length;
   public double unitPrice;
   public boolean isGerman;

    public Carpet(double width, double length, double unitPrice, boolean isGerman) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isGerman = isGerman;
    }

    public double calcCost(){

        if(isGerman){
            return 200 + (width * length) * unitPrice;
        }

        return (width * length) * unitPrice;

    }


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isGerman=" + isGerman +
                ", total cost=$" + calcCost() +
                '}';
    }
}
/*
Task03:
    1. Create a custom class named Carpet:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                Add a constructor that can set all the fields

                instance methods:
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice
 */