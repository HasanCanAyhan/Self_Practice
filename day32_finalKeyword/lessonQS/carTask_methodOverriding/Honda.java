package day32_finalKeyword.lessonQS.carTask_methodOverriding;

public class Honda extends Car{

    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    // Implementation inside the start method same to the Implementation of start method inside the Car class
    // we don´t need to use method overriding, because there is no different implementation

}
/*
 2. Honda
    start(): "Press the brake and twist the key to ignition"
 */