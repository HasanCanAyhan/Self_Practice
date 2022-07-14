package day38_exceptions.lessonQS;

public class BreakTimeException extends RuntimeException{ // unchecked , i-con different

    // Constructor (2 )

    public BreakTimeException(){
        super("It´s break time"); // parent class constructor
    }

    public BreakTimeException(String message){
        super(message); // call parent class constructor with argument
    }


}
