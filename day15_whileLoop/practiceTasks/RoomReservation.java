package day15_whileLoop.practiceTasks;

import java.util.Scanner;

public class RoomReservation { // Task 8


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to reserve a room ? Yes/No");
        String yesOrNo = input.next().toLowerCase();

        String selection = input.nextLine().toLowerCase();

        while( ! ( yesOrNo.equals("yes") || yesOrNo.equals("no")   )   ){
            System.err.println("Invalid Entry! Please re-enter :");
            yesOrNo = input.next().toLowerCase();
        }

        if( yesOrNo.equals("yes")){

            System.out.println();
            System.out.println("Which type of room do you want to reserve?");
            selection = input.nextLine().toLowerCase();



            while ( !  ( (selection.equals("king bed") )  || (selection.equals("queen bed")) || (selection.equals("single bed"))  ) ){
                System.err.println("Invalid Entry! Please re-enter :");
                selection = input.nextLine().toLowerCase();

            }



            String result="";
            switch(selection){

                case "king bed":
                    result = " King Bed - 120$";
                    break;
                case "queen bed":
                    result = "Queen Bed - 100$";
                    break;
                case "single bed":
                    result ="Single Bed - 80$";
                    break;
            }

            System.out.println("result = " + result);


        }else{
            System.out.println("Have a nice day!");
        }

    }


}

/*
Extra Spicy:

	8. Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */
