package day37_exceptions.lessonQS;

public class ExceptionsIntro {

    public static void main(String[] args) {

        // Unchecked Exception - during the runtime - unexpected

        String str = "Java";

        //char ch = str.charAt(250); // unchecked exceptions

        //System.out.println(ch);

        Pizza pizza = null; // there is no object here
        //pizza.calcCost(); // unchecked exceptions


        System.out.println( 50  / 0 ); // unchecked exception // ArithmeticException : / by zero

        System.out.println("Hello");

        System.out.println("----------------------------------------------------------------");

        int score = 100;

        if (score > 59){
            System.out.println("Your grade is D");
        }else if(score > 70){
            System.out.println("Your grade is C");
        }

        /*
        Note :
        Bug is not related to the exceptions. We can call it as logical error/bug/defect.
        To name it exception, code must have a problem in compile or runtime.
         */

        System.out.println("----------------------------------------------------------------");

        // Checked Exception - during the compile time

        //FileInputStream file = new FileInputStream(""); // Checked is named as compile time error - unwanted ,  Unhandled Exception

        //Thread.sleep(3000);// Unhandled Exception means Checked exception


    }


}
