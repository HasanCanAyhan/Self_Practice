package day17_customClass.practiceTasks;

public class SalaryCalculator { // Task 4
    // Attributes-Instances Variables
    public int hourlyRate;
    public int weeklyHours;
    public int stateTaxRate;
    public int federalTaxRate;
    // setInfo
    public void setInfo(int hourlyRate, int weeklyHours, int stateTaxRate, int federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }
    // Methods
    // salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
    public double salary(int hourlyRate, int weeklyHours){
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        double  salary = hourlyRate * weeklyHours * 52;
        return salary;
    }
    //   stateTax(): calculates the totalstateTax, and returns it as double
    public double totalStateTax(int stateTaxRate){
        this.stateTaxRate = stateTaxRate;
        double totalStateTax = this.salary(hourlyRate, weeklyHours) * (stateTaxRate / 100.0);
        return totalStateTax;
    }
    // federalTax(): calculates the total federal tax, and returns it as double
    public double totalFederalTax(int federalTaxRate){
        this.federalTaxRate = federalTaxRate;
        double totalFederalTax = this.salary(hourlyRate, weeklyHours) * (federalTaxRate / 100.0);
        return totalFederalTax;
    }
    // salaryAfterTax(): calculates the salary after tax, and returns it as double
    public double salaryAfterTax(){
        double salaryAfterTax = this.salary(hourlyRate,weeklyHours) - (totalStateTax(stateTaxRate) + totalFederalTax(federalTaxRate));
        return salaryAfterTax;
    }
    // toString
    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary=" + salary(hourlyRate,weeklyHours) +
                ", totalStateTax=" + totalStateTax(stateTaxRate) +
                ", totalFederalTax=" + totalFederalTax(federalTaxRate) +
                ", salaryAfterTax=" + salaryAfterTax()+
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