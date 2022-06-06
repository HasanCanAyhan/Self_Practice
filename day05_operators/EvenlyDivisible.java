package day05_operators;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 65;

        boolean isNumberDivisibleBy2 = number %2 == 0;
        boolean isNumberDivisibleBy3 = number %3 == 0;
        boolean isNumberDivisibleBy5 = number %5 == 0;

        System.out.println("The number is : " + number);
        System.out.println("The number is divisible by 2: " + isNumberDivisibleBy2);
        System.out.println("The number is divisible by 3: " + isNumberDivisibleBy3);
        System.out.println("The number is divisible by 5: " + isNumberDivisibleBy5);





    }

}

/*
 3. Create a class named EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
 */
