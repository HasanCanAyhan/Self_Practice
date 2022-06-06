package day06_ifStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int number = -12;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        String result = "";

        if (isPositive){
            result = "Positive";
        }

        if(isNegative){
            result = "Negative";
        }

        if(isZero){
            result = "Zero";
        }

        System.out.println("result = " + result);

    }

}
/*
1. Create a class named PosNegZero.java
2. An integer variable named number is declared and given, Write a
program can identify if the number is positive, negative or zero

Ex:

number = 20

output:
Positive
 */