package day32_finalKeyword.lessonQS;

import java.time.LocalDate;


 /*
    FINAL KEYWORD:

    - can not re-assign, inherit, override
    - used to restrict the user
    - makes the features unchangeable
    - only applicable to a variable, method, or a class
    - Final Variable : Stop value change
    - Final Method : Prevent Method Overridding
    - Final Class : Prevent Inheritance

    -Constructor can not be final!

    - Private and final methods can be overloaded but they cannot be overridden

     */


class Student  { // String class is =>>> public final class String
    // if Parent class is final, then parent class can not have child.

    public final void language(){
        System.out.println("Java Programming");
    }

}


public final class FinalKeyword extends Student{  // child class can be final

    /*
    @Override
    public void language() { // error :  final methods can never be overridden
        System.out.println("Python Programming");
    }


     */


    public  FinalKeyword(){ // Constructor  : can not be final

    }



    public static void main(String[] args) { // you shouldn´t make main method final , pointless!!


        final char gender = 'M'; // now unchangeable

        System.out.println(gender); // M

        // gender = 'F'; --->> error

        System.out.println(gender); // F


        System.out.println("---------------------------------------");

        final LocalDate dateOfBirth = LocalDate.now(); // now unchangeable

        System.out.println(dateOfBirth);

       // dateOfBirth = dateOfBirth.plusYears(1);

        System.out.println(dateOfBirth);

        System.out.println("---------------------------------------");


        new Student().language();
        new FinalKeyword().language();

        System.out.println("---------------------------------------");

        // Garbage Collection

        final String name = "James"; // so after final keyword object won't be eligible for garbage collection,because it is not changeable

        //name = null; --->> 1.way

        //name = "Daniel"; --> another new Object --->> 2.Way

        System.out.println(name);


    }






}
