package day04_concatenation;

public class SalaryCalculator1 {

    public static void main(String[] args) {

        int hourlyRate = 50,
            weeklyHours = 45;

        double  stateTax = 0.06,
                federalTax = 0.26 ;

        int gross_pay = hourlyRate * weeklyHours * 52;
        double federal_tax_pay = gross_pay * federalTax;
        double state_tax_pay = gross_pay * stateTax;
        double total_tax_pay = federal_tax_pay + state_tax_pay;
        double netIncome = gross_pay - total_tax_pay;


        System.out.println("Gross pay is: " + "$" + gross_pay);
        System.out.println("federal_tax_pay is: "+ "$" + federal_tax_pay);
        System.out.println("state_tax_pay is: "+ "$" + state_tax_pay);
        System.out.println("total_tax_pay is : "+ "$" + total_tax_pay);
        System.out.println("netIncome is : "+ "$" + netIncome);
    }
}
/*
5. Create a class named SalaryCalculator, and declare the following variables:
				hourlyRate
				weeklyHours
				stateTaxRate
				federaltaxrate

	5.1 Use the given info above to calculate the followings:
				salaryBeforeTax
				stateTax
				federalTax
				totalTax
				salaryAfterTax

	5.2 Display each of the above in the following format:
		Ex:
		      hourlyRate = $50
		      weeklyHours = 45
	          stateTax = 6  (given as percentage)
	          federalTax = 26 (given as percentage)

		output:
		       Gross pay is: $117000
	                Federal tax is: $30420
	                State tax is: $7020
	                Total tax is: $37440
	                 Net income is: $79560
 */