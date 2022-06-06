package day17_customClass.practiceTasks;

public class ItemObjects { // Task 6

    public static void main(String[] args) {

        Item item1 = new Item();

        item1.setInfo("Deutsch Listening Book - Cornelsan",25.0 ,2);
        System.out.println(item1);


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
