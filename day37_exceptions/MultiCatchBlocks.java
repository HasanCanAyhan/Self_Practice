package day37_exceptions;

import day35_polymorphism.lessonQS.transportationTask.Car;


public class MultiCatchBlocks {

    public static void main(String[] args) {


        System.out.println("Program1 started");

        Car car = null;

        try {
            car.drive(); // NullPointerException

        }catch (ArithmeticException e){
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Second Catch Block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third Catch Block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Fourth Catch Block");
            e.printStackTrace();
        }catch (RuntimeException e){ // Runtime is our guarantee!:) it should be at the End, because parent .
            System.out.println("Fifth Catch Block");
            e.printStackTrace();
        }

        // Parent exception class can not be placed before child exception class


        System.out.println("Program1 ended");

        /* you can not write try blocks !!  But you can write catch blocks
        try {

        }catch (){

        }try {

        }try{

        }


         */





    }


}
