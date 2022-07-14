package day38_exceptions.lessonQS;

class CustomCheckedException extends Exception{ // checked

}


class CustomUncheckedException extends RuntimeException{ // unchecked

}


public class CustomExceptions { // main class

    public static void main(String[] args) throws CustomCheckedException {


        //throw new CustomCheckedException();

        // or:

        try {
            throw  new CustomCheckedException();
        }catch ( CustomCheckedException e){
            e.printStackTrace();
        }


        System.out.println("-------------------------------------------------");

        throw new CustomUncheckedException();



    }

}
