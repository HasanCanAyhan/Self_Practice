package day15_whileLoop.lessonQS;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter age");

        int age = input.nextInt();

        while ( !(age >= 1  && age <= 150 )  ) {

            System.err.println(("Invalid value! Please re-enter the age: "));
            age = input.nextInt();

        }

        System.out.println("Are you German citizen ? Yes / No ");

        String yesOrNo = input.next().toLowerCase();

        while ( !(yesOrNo.equals("yes") || yesOrNo.equals("no")   )     ){

            System.err.println(("Invalid ! Please re-enter the answer: "));
            System.err.println(("Are you German citizen ? Yes / No "));
            yesOrNo = input.next().toLowerCase();

        }


        if( age >=21 && yesOrNo.equals("yes")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }

        input.close();

    }

}
