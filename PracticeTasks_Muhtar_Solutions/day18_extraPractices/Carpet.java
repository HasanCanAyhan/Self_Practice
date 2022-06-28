package PracticeTasks_Muhtar_Solutions.day18_extraPractices;

public class Carpet {

    public double width,length;
    public int unitPrice;
    public boolean isPersian;


    public Carpet(double width, double length, int unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){

        double totalCost = unitPrice * width * length;

        return (isPersian)? totalCost + 200 : totalCost;

        /*
        if (isPersian){
            return totalCost+= 200;
        }

        return totalCost;
         */

    }



    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total cost= $" + calcCost() +
                '}';
    }


}
/*
Create a class named Carpet:
	 		Attributes:
                width
                length
                unitPrice
                isPersian
            Actions:
        		setInfo(): sets all the fields
                calcCost(): should be able to calculate the total cost of the carpet and return it as double
                toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
		    total price of carpet = (width*length)*unitprice
		    if the carpet is persian  carpet, add 200$ to the totalPrice
 */