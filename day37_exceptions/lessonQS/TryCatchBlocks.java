package day37_exceptions.lessonQS;

public class TryCatchBlocks {

    public static void main(String[] args) {

        /*
        The run process of code will not be stopped and the remaining code fragment will continue to run with the help of handling the exceptions.
         */


        System.out.println("Program1 started");


        try{
            System.out.println( 9 / 0  ); // ArithmeticException

            System.out.println("Try block");

        }catch (ArithmeticException e){ // e : It is just a parameter variable name. You can name it whatever you want. Not important.

            System.out.println("Catch Block");
        }


        System.out.println("Program1 ended");


        System.out.println("----------------------------------------------------------");


        System.out.println("Program2 started");

        String str = null;

        try{

            System.out.println(str.toLowerCase());
            System.out.println("Try Block");

        }catch (RuntimeException e){

            System.out.println("Catch Block");
        }

        System.out.println("Program2 ended");

        System.out.println("----------------------------------------------------------");

        System.out.println("Program3 started");

        try {
            Thread.sleep(5000); // checked exception
            System.out.println("Try Block"); // this block is executed , this block handled this exception

        }catch (InterruptedException e){
            System.out.println("Catch Block");
        }

        System.out.println("Program3 ended");

    }


}
