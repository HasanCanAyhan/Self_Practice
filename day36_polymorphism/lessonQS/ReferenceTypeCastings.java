package day36_polymorphism.lessonQS;

import day29_inheritance.lessonQS.animalTask.Animal;
import day29_inheritance.lessonQS.animalTask.Dog;
import day30_inheritance.lessonQS.phoneTask.Iphone;
import day30_inheritance.lessonQS.phoneTask.Nokia;
import day30_inheritance.lessonQS.phoneTask.Phone;
import day30_inheritance.lessonQS.phoneTask.Samsung;
import day33_abstraction.lessonQS.employeeTask.*;
import day35_polymorphism.lessonQS.transportationTask.Auto_Pilot;
import day35_polymorphism.lessonQS.transportationTask.Electricc;
import day35_polymorphism.lessonQS.transportationTask.Tesla;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        //Upcasting

        Dog dog = new Dog();

        // Cat cat = new Dog(); // There is no relation !! Error!!!

        Animal animal = (Animal) new Dog(); // upcasting, you do not need to write cast operator-(Animal)

        System.out.println("----------------------------------------------------------");

        // Down casting

        Animal animal1 = new Dog();//upcasting ==> Polymorphism
        animal1.setInfo("Max", "Husky", 'M', 4, "Large", "White");

        animal1.eat();
        animal1.drink();    // all of them inside Animal Class-Reference Type
        animal1.sleep();

        //animal1.bark(); you can not call it, that's why we should use down - casting

        //     animal1 is referencing dog object, this object can be referenced by Dog Class-Type
        ((Dog)animal1).bark(); // down casting

        // or:

        Dog dog1 = (Dog) animal1;
        dog1.bark();

        System.out.println("--------------------------------------------------");

        // ClassCastException

        // (  (Cat)animal1).scratch(); // ClassCastException - Dog cannot be cast to class
        // animal1 is referencing dog object
        // Dog can not be converted to Cat, because there is no "IS-A" relationship between Dog and Cat


        System.out.println("------------------------------------------------------------------");


        Phone phone = new Nokia("Brick","Small","Pink",50);

        phone.call(911);
        phone.text(911);

        ((Nokia) phone).selfDefense();

        //((Iphone)phone).faceTime(123456);// ClassCastException -  Nokia object cannot be cast to class
        // Nokia can not be converted to Iphone, because there is no "IS-A" relationship between Nokia and Iphone


        System.out.println("----------------------------------------------------------------------------------");

        Employee employee = new Developer("Lucy",30,'F',"C1","Java Developer",95000,"Java");

        employee.work();

        // getProgrammingLanguage() is a unique method in the Developer Class
        System.out.println(   ((Developer)employee).getProgrammingLanguage()    );

        //Tester tester = (Tester) employee;// ClassCastException
        //                       employee is referencing Developer object, there is no relation between Tester and Developer


        System.out.println("-----------------------------------------");


        Electricc electricc = new Tesla("Tesla","Model Y","Blue",2020,55000); // upcasting:implicit-automatically

        electricc.charge();

        (  (Tesla)electricc).selfDrive(); // selfDrive() orginally came from AutoPilot Interface
        (  (Tesla)electricc).autoPark();

        ( (Auto_Pilot)electricc).selfDrive(); // electricc is referencing object Tesla and  is a relationship with AutoPilot


        System.out.println("-----------------------------------------");


        Employee employee1 = new Teacher("James",45,'M',"B1","Math Teacher",75000);

        Employee employee2 = new Developer("Lucy",30,'F',"C1","Java Developer",95000,"Java");

        Employee employee3 = new Driver("Aaron",48,'M',"D1","Truck Driver",90000);

        Employee employee4 = new Tester("Emily",35,'F',"E1","Manual Tester",80000);

        employee1.work(); // object type decide what the implementation is , here Teacher
        employee2.work();
        employee3.work();
        employee4.work();











    }

}
