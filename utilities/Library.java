package utilities;

public class Library {


    public static void sleep(double seconds){ // static :  we can call it through Class Name
        // if we declared throws keyword that means, temporary, it is still not handled it

        try {
            Thread.sleep((long) (seconds * 1000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }

}
