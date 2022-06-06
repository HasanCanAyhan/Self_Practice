package day16_nestedLoop.lessonQS;

import java.util.Scanner;

public class CydeoLogin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your username");
        String u = input.next();

        System.out.println("enter your password");
        String p = input.next();

        if(u.equals("Cydeo") && p.equals("WoodenSpoon") ){
            System.out.println("Logged in");

        }else { // incorrect login

          for (int i = 3; i > 0; i--) { // i : 3 2 1

              if(i != 1){
                  System.err.println("Invalid Attempt!");
              }else{
                  System.err.println("This is your last chance,please re-enter your username and password");
              }


                  System.err.println("You have left " + (i)+ " chances to try!!");

                  System.out.println("enter your username");
                  u = input.next();

                  System.out.println("enter your password");
                  p = input.next();

              if(u.equals("Cydeo") && p.equals("WoodenSpoon") ) {
                  System.out.println("You Logged in ");
                  break;// exit the loop
              }


           }

          if( !(u.equals("Cydeo") && p.equals("WoodenSpoon")) ){
              System.err.println("Your account is lucked!");
              System.exit(0);
          }



        }

                input.close();

    }

}
/*
Warmup tasks:
	1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."
 */