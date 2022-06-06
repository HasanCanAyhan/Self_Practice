package day12_customMethods;

public class Day {// Task 4

    public static void main(String[] args) {


        int num = 12;
        day(num);

    }


    public static void day(int num){

        String result = "";

        switch (num){

            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid Number";

        }

        System.out.println(result);




    }




}
/*
4. Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday

 */