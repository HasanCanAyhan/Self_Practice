package day09_scanner.practiceTasks;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" how many total shares you have already ? ");
        int totalShares = input.nextInt();

        String result = "Your total stock market holding is $ ";

        if(totalShares > 0) {

            System.out.println("how much their total value in the stock market : ");
            double totalValue = input.nextDouble();
            System.out.println("enter the name of the company they have the most shares in ");

            input.nextLine();

            String nameOfCampany = input.nextLine();

            result += totalValue + " which is made up of " + totalShares + " shares. " +nameOfCampany
                    + " is your company holdings";


        }else {
            result = "Invalid value !";
        }


        System.out.println(result);

        input.close();




    }

}
/*
8. Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
 */