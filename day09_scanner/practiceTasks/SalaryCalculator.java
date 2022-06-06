package day09_scanner.practiceTasks;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter your  hourlyRate : ");
        int hourlyRate = input.nextInt();
        System.out.println("how many hours you work in a week : ");
        int hoursInWeek = input.nextInt();
        System.out.println(" enter state tax (in percentage) : ");
        double state_tax = input.nextDouble();
        System.out.println(" enter federal tax (in percentage) : ");
        double federal_tax = input.nextDouble();

        int salary = hourlyRate * hoursInWeek * 52;
        double federal_tax_pay = salary * federal_tax;
        double state_tax_pay = salary * state_tax;
        double total_tax_pay = federal_tax_pay + state_tax_pay;
        double netIncome = salary -total_tax_pay;


        System.out.println("salary = " + salary);
        System.out.println("state_tax = " + state_tax);
        System.out.println("federal_tax = " + federal_tax);
        System.out.println("federal_tax_pay = " + federal_tax_pay);
        System.out.println("state_tax_pay = " + state_tax_pay);
        System.out.println("total_tax_pay = " + total_tax_pay);
        System.out.println("netIncome = " + netIncome);


        input.close();


    }


}
/*
10. Crreate a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */