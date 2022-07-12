package day35_polymorphism.lessonQS.transportationTask;


public interface Auto_Pilot extends Auto_Park { // meant to be inherited

    //void autoPark(); do not need to create a new one , just reuse from the AutoPark interface

    void selfDrive();

    // totaly 2 abstract method inside the AutoPilot


}
/*
3. Create a sub interface of AutoPark named AutoPilot:

				abstract methods:
						autoPilot() == (selfDrive())
 */
