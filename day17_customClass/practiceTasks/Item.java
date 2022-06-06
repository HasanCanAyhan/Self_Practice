package day17_customClass.practiceTasks;

public class Item { // Task 6

    public String name;
    public double unitPrice;
    public int quantity;


    public void setInfo(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    // calcCost()

    public double calcCost(double unitPrice,int quantity){

        this.unitPrice = unitPrice;
        this.quantity = quantity;

        double calcCost = unitPrice * quantity;
        return  calcCost;

    }

    public String toString() {
        return "Item{" +
                "name=" + "\"" +name +"\""  +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalPrice=" + calcCost(unitPrice,quantity) +
                '}';
    }
}
/*
6. Create a class called Item
    Attributes:
        name, unitPrice, quantity

    Actions:
    	setInfo(): sets all the fields of Item object
        calcCost(): returns the total price of the Item
        toString(): when a SalaryCalculator object is passed in print statement, it should display the full information of the item object
 */
