package day38_exceptions;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword { // create Exception manually

    public static void main(String[] args) {

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 150){
            if (age < 0){
                throw new InputMismatchException("Age of the person should not be negative: " + age); // => System.err.println("Invalid age");
                // it is better than using the System.exit()
            }else{
                throw new InputMismatchException("Age of the person can not be grater then 150: " +age);
            }

        }

        if(age >= 21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }


        System.out.println("------------------------------------------------------");


        //throw new RuntimeException("Runtime exception");
        //System.out.println("Hello World");=>> after throw keyword you can not write anything , it gives error !!


        try {
            throw new FileNotFoundException(" "); // checked exception : try & catch or throws
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("----------------------------------------------------------------");

        RuntimeException exception = new RuntimeException();

        //throw exception; // reference variable or:
        //throw new RuntimeException();

        //throw new Person("Jimmy",45,'M'); // it should be IS-A relationship with RuntimeException
        // Object and Throwable don´t have IS A Relationship eachother.



    }


}
