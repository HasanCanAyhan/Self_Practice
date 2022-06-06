package PracticeTasks_Muhtar_Solutions.day17_customClass;

public class SalaryCalculator {

    public int hourlyRate;
    public int weeklyHours;
    public int stateTaxRate;
    public int federalTaxRate;

    public void setInfo (int hourlyRate, int weeklyHours, int stateTaxRate, int federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        // this.stateTaxRate = stateTaxRate/100;
        // to make sure that user does not need to convert the percentage to decimal
        this.federalTaxRate = federalTaxRate;
        // this.federalTaxRate = federalTaxRate/100;
        // to make sure that user does not need to convert the percentage to decimal
    }

    public double salary(){

        return hourlyRate * weeklyHours * 52;

    }

    public double stateTax(){

        return  salary() * (stateTaxRate / 100.0);

    }

    public double federalTax(){

        return salary() * (federalTaxRate / 100.0);
    }

    public double salaryAfterTax(){



        return  salary() - (federalTax() + stateTax()) ;

    }


    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate= " + hourlyRate +
                ", weeklyHours= " + weeklyHours +
                ", stateTaxRate= " + stateTaxRate +
                ", federalTaxRate= " + federalTaxRate +
                ", salary= " + salary() +
                ", toplam state Tax " + stateTax() +
                ", toplam federal Tax " + federalTax() +
                ", salary After Tax " + salaryAfterTax() +
                '}';
    }
}
/*
4. Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percenrage, you will responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): claculates the totalstateTax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */
/*
Warmup tasks:
	1. Create a class called SalaryCalculator.java
			1.1declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			1.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
				Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			1.3 use print statement to print each of the above
					Ex:	   hourlyRate = $50
						   weeklyHours = 45
						   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
						   federalTaxRate = 26 (given as percentage, you need to convert to decimal)

					    output:
					    	Gross pay is: $117000
					    	Federal tax is: $30420
				    		State tax is: $7020
				    		Total tax is: $37440
				    		Net income is: 79560
 */