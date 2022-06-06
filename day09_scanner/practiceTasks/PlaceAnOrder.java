package day09_scanner.practiceTasks;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter the product name : ");
        String product_name = input.nextLine();

        System.out.println("enter the price : ");
        double price = input.nextDouble();

        System.out.println("enter the quantity : ");
        int quantity = input.nextInt();

        System.out.println("enter their first name : ");
        String first_name = input.next();

        double total_price = price * quantity;

        System.out.println(first_name + "," + " your order for " + quantity + " " + product_name + " has been places. Your total is " + total_price + ".");


        input.close();

    }

}
/*
7. Create a class named PlaceAnOrder:
                Ask User to enter the product name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */