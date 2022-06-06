package day06_ifStatements.practiceTasks;

public class NetIncomeCalc {

    public static void main(String[] args) {

        double salary = 130000;

        double taxRate = 0,
                taxPay = 0,
                netIncomeCalc = 0;

        boolean isMarried = true;

        if (salary >= 130000) {

            if (isMarried) {
                taxRate = 0.30;
                taxPay = salary * taxRate;
                netIncomeCalc = salary - taxPay;
            } else {
                taxRate = 0.35;
                taxPay = salary * taxRate;
                netIncomeCalc = salary - taxPay;
            }

        }
        if (salary >= 100000 && salary <= 129000) {
            if (isMarried) {
                taxRate = 0.25;
                taxPay = salary * taxRate;
                netIncomeCalc = salary - taxPay;
            } else {
                taxRate = 0.30;
                taxPay = salary * taxRate;
                netIncomeCalc = salary - taxPay;

            }

        }
        if (salary >= 80000 && salary <= 99000) {
            if (isMarried) {
                taxRate = 0.20;
                taxPay = salary * taxRate;
                netIncomeCalc = salary - taxPay;
            } else {
                taxRate = 0.25;
                taxPay = salary * taxRate;
                netIncomeCalc = salary - taxPay;

            }

        }
        if (salary <= 79000) {
            if (isMarried) {
                taxRate = 0.15;
                taxPay = salary * taxRate;
                netIncomeCalc = salary - taxPay;
            } else {
                taxRate = 0.20;
                taxPay = salary * taxRate;
                netIncomeCalc = salary - taxPay;

            }
        }
        System.out.println("taxPay = " + taxPay);
        System.out.println("netIncomeCalc = " + netIncomeCalc);



        /* Another Solution
         Scanner input = new Scanner(System.in);
        String result = "";
        int taxRate;
        int salaryAfterTax;
        System.out.println("Salary");
        int salary = input.nextInt();
        boolean isMarried = true;

        if(salary >= 130000 && !isMarried) {
            taxRate = 35;
            salaryAfterTax = salary - (salary * taxRate)/100;
            result += salaryAfterTax;
        }
        if(salary >= 100000 && salary <= 129000 && !isMarried){
            taxRate = 30;
            salaryAfterTax = salary - (salary * taxRate)/100;
            result += salaryAfterTax;
        }
        if(salary >= 80000 && salary <= 99000 && !isMarried){
            taxRate = 25;
            salaryAfterTax = salary - (salary * taxRate)/100;
            result += salaryAfterTax;
        }
        if(salary <= 79000 && !isMarried){
            taxRate = 20;
            salaryAfterTax = salary - (salary * taxRate)/100;
            result += salaryAfterTax;
        }
    // Is Married
        if(salary >= 130000 && isMarried) {
            taxRate = 30;
            salaryAfterTax = salary - (salary * taxRate)/100;
            result += salaryAfterTax;
        }
        if(salary >= 100000 && salary <= 129000 && isMarried){
            taxRate = 25;
            salaryAfterTax = salary - (salary * taxRate)/100;
            result += salaryAfterTax;
        }
        if(salary >= 80000 && salary <= 99000 && isMarried){
            taxRate = 20;
            salaryAfterTax = salary - (salary * taxRate)/100;
            result += salaryAfterTax;
        }
        if(salary <= 79000 && isMarried){
            taxRate = 15;
            salaryAfterTax = salary - (salary * taxRate)/100;
            result += salaryAfterTax;
        }
        System.out.println(result);

         */


    }

}
/*

4. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax

 */
