package day37_exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try {
            System.out.println( 9 / 0  );
        }catch (RuntimeException e){ // Parent for unchecked Exception
            System.out.println("Runtime Exception has been caught");
            e.printStackTrace();
            // System.exit(1); // if there is "System.exit()", finally block can not be executed.
        }finally { // always will be executed / optional
            System.out.println("Finally Block");
        }


        /*
        final vs finalize vs finally

            final : keyword ==>> unchangeable

            finalize : method , come from Object Class inherited from Object Class, Garbage collector use it to collect objects that are eligible for garbage collection

            finally: block ==>> can only be used with try&catch

         */



    }

}
