package day35_polymorphism.lessonQS.transportationTask;

public class Tesla extends Car implements Electricc,Auto_Pilot{
    // we dont need to write again AutoPark, because Autopilot extends AutoPark,  Autopilot is enough


    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }
    @Override
    public void transportPeople() { // it comes from Parent class

    }

    @Override
    public void start() { // it comes from Parent class

    }


    @Override
    public void autoPark() { // it comes from AutoPark interface

    }

    @Override
    public void selfDrive() { // it comes from AutoPilot interface

    }

    @Override
    public void charge() { // it comes from Electric interface

    }
}
/*

	8. Create a sub class of Car named Tesla that implements AutoPark, AutoPilot and Electric
 */