package day15_whileLoop.practiceTasks;

import java.util.Scanner;

public class InsuranceQuote { // Task 10

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your name : ");
        String name = input.nextLine().toLowerCase();

        System.out.println("enter your gender (female or male) :");
        String gender = input.next().toLowerCase();


        while(    !( gender.equals("male") || gender.equals("female")  )           ){

            System.err.println("Invalid entry! Please re-enter:");
            gender = input.next().toLowerCase();

        }

        System.out.println("are you married? (Yes / No");
        String married = input.next().toLowerCase();

        while( !( married.equals("yes") || married.equals("no")  ) ){

            System.err.println("Invalid entry! Please re-enter:");
            married = input.next().toLowerCase();

        }

        System.out.println("enter your age:");
        int age = input.nextInt();

        while(  !(age > 0 && age <= 120  )     ){
            System.err.println("Invalid entry! Please re-enter:");
            age = input.nextInt();

        }

        System.out.println("enter how many miles you drive in a day");
        double miles = input.nextDouble();


        while(  !(  miles > 5   )        ){
            System.err.println("Invalid entry! Please re-enter: ");
             miles = input.nextDouble();
        }

        System.out.println("do you want full coverage or liability insurance? (Full coverage : 1 Liability : 2) : ");
        int insurance = input.nextInt();


        while(  !(insurance == 1 || insurance == 2   ) ) {
            System.err.println("Invalid entry! Please re-enter: ");
            insurance = input.nextInt();

        }

        System.out.println("Have you had any accidents or claims in past 5 years (Yes/No) :");
        String accidents_claims = input.next().toLowerCase();

        while( !(accidents_claims.equals("yes") || accidents_claims.equals("no")) ){
            System.err.println("Invalid entry! Please re-enter: ");
            accidents_claims = input.next().toLowerCase();

        }


        System.out.println("Has your car  an anti-theft device (Yes/No) : ");
        String anti_theft_device = input.next().toLowerCase();

        while(  !(anti_theft_device.equals("yes") || anti_theft_device.equals("no"))  )    {
            System.err.println("Invalid entry! Please re-enter: ");
            anti_theft_device = input.next().toLowerCase();
        }

        double insurance_quote_calc_for_liability= 0;
        double insurance_quote_calc_for_fullCoverage = 0;

        if(insurance == 2) {

            if (age < 25) {
                insurance_quote_calc_for_liability += 90;
            } else {
                insurance_quote_calc_for_liability += 50;
            }


            if (miles <= 10) {
                insurance_quote_calc_for_liability += 10;
            } else if (miles > 10 && miles <= 50) {
                insurance_quote_calc_for_liability += 30;
            } else {
                insurance_quote_calc_for_liability += 50;
            }

        }

        if(insurance == 1){

            if(age < 25){
                insurance_quote_calc_for_fullCoverage += 160;
            }else{
                insurance_quote_calc_for_fullCoverage += 120;
            }


            if (miles <= 10) {
                insurance_quote_calc_for_fullCoverage += 20;
            } else if (miles > 10 && miles <= 50) {
                insurance_quote_calc_for_fullCoverage += 40;
            } else {
                insurance_quote_calc_for_fullCoverage += 70;
            }

        }



        if(anti_theft_device.equals("yes")){
            insurance_quote_calc_for_fullCoverage -= (insurance_quote_calc_for_fullCoverage* 0.05);
            insurance_quote_calc_for_liability -= (insurance_quote_calc_for_liability* 0.05);
        }

        if(accidents_claims.equals("yes")){
            insurance_quote_calc_for_fullCoverage += (insurance_quote_calc_for_fullCoverage * 0.15);
            insurance_quote_calc_for_liability += (insurance_quote_calc_for_liability * 0.15);
        }else{
            insurance_quote_calc_for_fullCoverage -= (insurance_quote_calc_for_fullCoverage * 0.10);
            insurance_quote_calc_for_liability -= (insurance_quote_calc_for_liability * 0.10);
        }

        if(married.equals("yes")){
            insurance_quote_calc_for_fullCoverage -= (insurance_quote_calc_for_fullCoverage * 0.05);
            insurance_quote_calc_for_liability -= (insurance_quote_calc_for_liability * 0.05);
        }


       if(insurance == 2){
           System.out.println("insurance_quote_calc_for_liability = " + insurance_quote_calc_for_liability);
       } else{
           System.out.println("insurance_quote_calc_for_fullCoverage = " + insurance_quote_calc_for_fullCoverage);
       }


    }

}
/*
10. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
	    		1. Ask the user to enter your name
	    		2. Ask the user to enter your gender
	    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				3. Ask the user if he/she is married(Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				4. Ask user to enter your age
						(age can not be negative or greater than 120)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				5. Ask user to enter how many miles he/she drives in a day
						(mileage can not be negative or less than 5)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				6. Ask the user if he/she wants full coverage or liability insurance?

				7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

				8. Ask the user if his/her car has an anti-theft device (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			Calculate the price of the insurance and display all the info of the user

				Insurance Quote calculation:
					starting prices for liability:
						age < 25 ===> 90
						age >= 25 ==> 50

						miles <= 10 ====> $10
					    miles > 10 and miles <= 50 ==> $30
					    miles > 50 ===>  $50

					starting prices for full coverage:
						age < 25 ===> 160
						age >= 25 ==> 120

						miles <= 10 ====> $20
					    miles > 10 and miles <= 50 ==> $40
					    miles > 50 ===>  $70


				    If the car has anti-theft device ==> 5% discount
				    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
				    If he/she never had any accidents or claims in past 5 years ==> 10% discount
				    If he/she is married ==> 5% discount
 */