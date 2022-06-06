package day05_operators;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = 200;

        boolean isNumberPositive = number > 0;
        boolean isNumberNegative = number < 0;
        boolean isNumberZero = number == 0;

        System.out.println("The number is : " + number);
        System.out.println("The number is positive : " + isNumberPositive);
        System.out.println("The number is positive : " + isNumberNegative);
        System.out.println("The number is zero : " + isNumberZero);


    }

}
/*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */