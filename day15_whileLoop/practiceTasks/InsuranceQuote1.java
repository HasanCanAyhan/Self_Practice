package day15_whileLoop.practiceTasks;

import java.util.Scanner;

public class InsuranceQuote1 {

    public static void main(String[] args) {

        double liability=0;
        double fullCoverage=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=input.nextLine().toLowerCase();
        System.out.println("Enter your gender: Female/Male");
        String gender=input.next().toLowerCase();
        while(!(gender.equals("female")||gender.equals("male"))) {
            System.out.println("Invalid gender response. Please, re-enter:");
            gender = input.next().toLowerCase();
        }
        System.out.println("Are you married? Yes/No");
        String married=input.next().toLowerCase();
        while(!(married.equals("yes")||married.equals("no"))){
            System.out.println("Invalid marital status response. Please, re-enter:");
            married=input.next().toLowerCase();
        }
        System.out.println("Please, enter your age:");
        int age=input.nextInt();
        while(!(age>1 && age<=120)){
            System.out.println("Invalid age response. Please, re-enter:");
            age=input.nextInt();
        }
        System.out.println("How many miles per day do you drive?");
        int miles=input.nextInt();
        while(miles>0 && miles<5){
            System.out.println("Invalid miles response. Please, re-enter:");
            miles=input.nextInt();
        }
        input.nextLine();
        System.out.println("Would you like a full coverage or liability insurance?");//will choose later
        String coverage=input.nextLine().toLowerCase();
        System.out.println("Have you had any accidents in the past 5 years? Yes/No");
        String accidents=input.next().toLowerCase();
        while(!(accidents.equals("yes")||accidents.equals("no"))){
            System.out.println("Invalid response. Please, re-enter:");
            accidents=input.next().toLowerCase();
        }
        System.out.println("Do you have any anti-theft devices installed in your car? Yes/No");
        String device=input.next().toLowerCase();
        while(!(device.equals("yes")||device.equals("no"))){
            System.out.println("Invalid response. Please, re-enter:");
            device=input.next().toLowerCase();
        }
        //Insurance Calculation
        if(coverage.equals("liability")){       //liability if
            if(age<25){                   //age if
                liability+=90;
            }else{
                liability+=50;
            }
            if(miles<=10){                 //miles if
                liability+=10;
            }else if(miles>10 && miles<=50){
                liability+=30;
            }else{
                liability+=50;
            }
        }else if(coverage.equals("full coverage")){ //full coverage if
            if(age<25){
                fullCoverage+=160;
            }else{
                fullCoverage+=120;
            }
            if(miles<=10){
                fullCoverage+=20;
            }else if(miles>10 && miles<=50){
                fullCoverage+=40;
            }else{
                fullCoverage+=70;
            }
        }// end of miles and age statement for both lial and full

        if(device.equals("yes") && coverage.equals("liability")){
            liability-=liability*0.05;
        }else if(device.equals("yes") && coverage.equals("full coverage")){
            fullCoverage-=fullCoverage*0.05;
        }
        if(accidents.equals("yes") && coverage.equals("liability")){
            liability+=liability*0.15;
        }else if(accidents.equals("yes") && coverage.equals("full coverage")){
            fullCoverage+=fullCoverage*0.15;
        }
        if(accidents.equals("no") && coverage.equals("liability")){
            liability-=liability*0.1;
        }else if(accidents.equals("no") && coverage.equals("full coverage")){
            fullCoverage-=fullCoverage*0.1;
        }
        if(married.equals("yes") && coverage.equals("liability")){
            liability-=liability*0.05;
        }else if(married.equals("yes") && coverage.equals("full coverage")){
            fullCoverage-=fullCoverage*0.05;
        }

        if(coverage.equals("liability")){
            System.out.println("For liability coverage total price is: $"+liability);
        } else{
            System.out.println("For full coverage total price id: $"+fullCoverage);
        }


    }
}
