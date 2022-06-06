package PracticeTasks_Muhtar_Solutions.day15_whileLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a = 40;
        int b = 10;

        int count_divide = 0;
        while(a >= b){

            a= a-b;
            count_divide++;
        }

        System.out.println(count_divide);


    }

}
/*
Create a class named DivideTwoNumbers and Write a program that can divide two
positive numbers without using / (division) and * (multiplication) operators.
 */
