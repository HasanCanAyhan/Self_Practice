package day15_whileLoop.practiceTasks;

import java.util.Scanner;

public class LoginFunction {// Task 7

    public static void main(String[] args) {

        // correct username = Cydeo    correct password = Cydeo123

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userName = input.next();

        System.out.println("Enter your password :");
        String password = input.next();

        if(  userName.equals("Cydeo") && password.equals("Cydeo123")  ){

            System.out.println("Logged in");
        }else{

            int i = 3;
            while( ! (i  == 0) ){

                System.err.println("You have " + (i -1) + " chance left to log in") ;
                System.out.println("i = " + i);

                System.err.println("Invalid! Please try again");
                System.out.println("Enter your username: ");
                 userName = input.next();

                System.out.println("Enter your password :");
                 password = input.next();

                i--;


                if (userName.equals("Cydeo") && password.equals("Cydeo123")){
                    System.out.println("Logged in");
                    break;
                }else{
                    System.err.println("Your account is lucked!");

                }


            }




        }

        /*
        Another Solution

        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = input.next();

        System.out.println("Enter password");
        String password = input.next();
        String result = "Logged in";

        for (int i = 0; i < 3; i++) {
            if(!(userName.equals("Cydeo") && password.equals("Cydeo123"))){
                System.err.println("Wrong input, please re-enter");
                userName = input.next();
                password = input.next();
                if((userName.equals("Cydeo") && password.equals("Cydeo123"))){
                    result = "Logged in";
                    break;
                } else {
                    result = "Your account is blocked";
                }


         */


        input.close();







    }

}

/*
7. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."


 */
