package day05_operators;

public class OddOrEven {

    public static void main(String[] args) {

        double num = 20;
        boolean IsEven = num % 2 == 0;
        boolean IsOdd = !(num % 2 == 0);
        System.out.println("The number is : " + num );
        System.out.println("is the number even : " + IsEven);
        System.out.println("Is the number odd : " + IsOdd);


    }


}
/*
1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false


		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)
 */