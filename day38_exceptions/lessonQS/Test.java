package day38_exceptions.lessonQS;

import utilities.Library;

import java.time.LocalTime;

public class Test {

    public static void main(String[] args)  {


        System.out.println("Hello Cydeo");

        //Thread.sleep(3500);

        Library.sleep(3.5); // called it through class Name

        System.out.println("How are you today?");


        System.out.println("-------------------------------------------------------------");


        if (LocalTime.now().equals(LocalTime.of(4,0))){
            throw  new BreakTimeException(); // is a reletionship with Throwable
        }


        //throw new RuntimeException("Something went wrong");

        throw new BreakTimeException("Time to go home");
        // will be executed  constructor with parameter  from BreakTimeException Class

        //throw new BreakTimeException();
        // will be executed default constructor from BreakTimeException Class





    }

}
