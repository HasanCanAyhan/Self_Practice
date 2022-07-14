package day38_exceptions.lessonQS.shapeTask;

public class InvalidShapeException extends RuntimeException{ // unchecked- Custom Exception Class

    public InvalidShapeException(String message){
        super(message);
    }


}
