package day18_garbageCollection.practiceTasks;

public class Carpet { // Task 4

    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian;


    public void setInfo(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double total_price = 0;

        if (isPersian){
            total_price += 200 + ((width * length)*unitPrice);
        }else{

            total_price += (width * length)*unitPrice;
        }


        return total_price;

    }


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price = $" + calcCost() +
                '}';
    }
}
/*
4. Create a class named Carpet:
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