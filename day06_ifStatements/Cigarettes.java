package day06_ifStatements;

public class Cigarettes {

    public static void main(String[] args) {


        int age = 101;

        boolean isEligible = age >= 21 && age < 100;

        if (isEligible) {
            System.out.println("You are eligible to buy Cigarettes");
        }

        if (!isEligible){
            System.out.println("You are not eligible to buy Cigarettes");
        }



    }

}
/*
1. Create a class named Cigarettes.java
2. A variable named age is declared and given, Write a program that
can check if the person is eligible to buy cigarettes

Ex:

age = 20
output:
You are not eligible to buy Cigarettes
 */