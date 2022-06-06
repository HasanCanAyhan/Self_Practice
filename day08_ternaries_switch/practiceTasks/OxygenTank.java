package day08_ternaries_switch.practiceTasks;

public class OxygenTank {

    public static void main(String[] args) {

       String oxygenLevel = "Above 80";

       String result = "";

       switch (oxygenLevel){

           case "Above 90":
               result = "Your tank is full";
               break;

           case "Above 80":
               result = "Still Okay";
               break;

           case "Above 70":
               result = "Don´t go too far";
               break;

           case "Above 60":
               result = "Start to head back";
               break;

           case "Above 50":
               result = "Be careful now you at 50%";
               break;

           default:
               result = "Invalid";
               break;



       }


        System.out.println(result );


       // Solution 2 : Ternary

        int level = 90;

        String result2 = (level >= 90)?"Your tank is full" :(level >= 80)?"Still okay"
                         :(level >= 70)?"Don't go too far" :(level >= 60)?"Start to head back"
                         :"Be careful now you at 50%";

        System.out.println(result2);





    }
}
/*
4. Create a class called OxygenTank. You are diving in the ocean.
Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary
			Solution 2:	MUST use switch statement
 */


