package day15_whileLoop.lessonQS;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {

        // Eligible _vs_ Not Eligible

        Scanner input = new Scanner(System.in);

        System.out.println("enter your age :");
        int age = input.nextInt();

        while ( !(age >= 1 && age <= 150)    ){ // while the age is invalid
            System.err.println("Invalid value! Please re-enter your age :");
            age = input.nextInt();
        }


        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

        input.close();


    }

}


