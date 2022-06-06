package day12_customMethods;

public class NumberOfDays { // Task 5


    public static void main(String[] args) {

        numberOfDays("jUNe");


    }


    public static void numberOfDays(String month ){

      /*
      Hints:
        Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
        Months that has 30 days are: 4, 6, 9, 11
        Month that has 28 days: 2
       */

        String result = "";

        if (month.equalsIgnoreCase("january") || month.equalsIgnoreCase("march") || month.equalsIgnoreCase("may" ) ||
        month.equalsIgnoreCase("july") || month.equalsIgnoreCase("august") || month.equalsIgnoreCase("october") || month.equalsIgnoreCase("december")){

            result = month.substring(0,1).toUpperCase() +month.substring(1).toLowerCase() + " has 31 days.";


        }else if(month.equalsIgnoreCase("april") || month.equalsIgnoreCase("june") || month.equalsIgnoreCase("september")
                || month.equalsIgnoreCase("november")){

            result = month.substring(0,1).toUpperCase() +month.substring(1).toLowerCase() + " has 30 days";

        }else if (month.equalsIgnoreCase("february")){

            result = month.substring(0,1).toUpperCase() +month.substring(1).toLowerCase() + " has 28 days.";

        }else{
            result = "Invalid Name";
        }

        System.out.println(result);



    }



}
/*
5. Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
 */
