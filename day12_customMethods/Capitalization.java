package day12_customMethods;

public class Capitalization {// Task 2

    public static void main(String[] args) {


        capitalization();


    }


    public static void capitalization(){

        String first_name = "cyDeO";

        String last_name = "sCHooL";

        first_name = first_name.substring(0,1).toUpperCase() + first_name.substring(1).toLowerCase();

        last_name = last_name.substring(0,1).toUpperCase() + last_name.substring(1).toLowerCase();

        String full_name = first_name + " " + last_name;

        System.out.println(full_name);


    }




}
/*
2. Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
 */