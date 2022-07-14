package day37_exceptions.lessonQS;

public class TryCatchBlocks2 {

    public static void main(String[] args) {


        System.out.println("Program1 started");

        int[] arr = {1,2,3,4};

        try {

            System.out.println(arr[1000]);

        }catch (RuntimeException e){ // it is the parameter variable belongs to the catch block. Since it is a local variable, we cannot use it out of its own block.

           e.printStackTrace();// display full details of the exception after the executaion of program

            // System.out.println(e.getMessage());

        }

        System.out.println("Program1 ended");

        System.out.println("-----------------------------------------------------");


        System.out.println("Program2 started");

        try {
            System.out.println(9/0);
        }catch (RuntimeException e){
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }

        System.out.println("Program2 ended");


        System.out.println("-----------------------------------------------------");

        System.out.println("Program3 started");

        // shortcut : surround with try/catch
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program3 ended");

    }


}
