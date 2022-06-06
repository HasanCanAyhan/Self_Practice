package PracticeTasks_Muhtar_Solutions.day15_whileLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password:");
        String p = input.next();

        if(u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else {

            for (int i = 3; i >= 1; i--) {

                System.err.println("Invalid!You have " + i + " attepts to log in!");
                System.out.println("Enter your username:");
                u = input.next();
                System.out.println("Enter your password:");
                p = input.next();

                if (u.equals("Cydeo") && p.equals("Cydeo123")) { //if the user enters valid credentials
                    System.out.println("Logged in now!");
                    break;  // exits the loop
                }

            }

            if( ! (u.equals("Cydeo") && p.equals("WoodenSpoon") ) ){ // after all three attempts, if the username & password are still incorrect
                System.err.println("Your account now is locked, please contact with the support team");
            }


        }




    }

}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to
                    have three attempts to enter correct credentials and if all three attempts are failed,
                    then print "Your account is lucked."
 */
