package day35_polymorphism.lessonQS;

import day34_abstraction.lessonQS.animalTask.*;
import day34_abstraction.practiceTasks.carTask.AutoPark;
import day34_abstraction.practiceTasks.carTask.AutoPilot;
import day35_polymorphism.lessonQS.transportationTask.*;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Animal tiger = new Tiger("Sher Khan","Bengal",'M',5,"Large","Orange");
        //ref Type :Animal         Object Type :Tiger

        tiger.eat(); // object type method will be executed
        tiger.drink();
        tiger.sleep();
        //tiger.hunt();// does not exist in Animal Class, because of that we can not call it

        Animal animal = new Eagle("John","American Eagle",'M',3,"Small","Black&White");
        //animal.fly(); // does not exist in Animal Class, because of that, we can not call it

        animal.eat();// Eagle John is eating snake
        animal.sleep();// John sleeps 8 hours
        animal.drink();

        Flyable obj1 =  new Eagle("John","American Eagle",'M',3,"Small","Black&White");
        //obj1.eat();
        //obj1.drink();
        //obj1.sleep();
        obj1.fly();
        System.out.println(obj1.canFly);

        Lion lion = null;
        Parrot parrot = null;
        Shark shark = null;
        Dolphin dolphin = null;
        Eagle eagle = null;
        Duck duck = null;

        Dog dog = null;

        Cat cat = null;

        CydeoCar cydeoCar = null;

        Flyable[] birds = { parrot,eagle,duck};

        Swimmable[] fishes = {shark,dolphin,duck};

        Playable[] friendlyAnimals = {dog,cat,duck,parrot};

        System.out.println("-----------------------------------------------------------------------");

        // child  instanceof  parent , return boolean

        boolean isAnimal = dog instanceof Animal;
        //                  Dog is a relationship Animal
        System.out.println(isAnimal);

        System.out.println("-----------------------------------------------------");

        Car car = new Tesla("Tesla","Model y","White",2020,55000);
        //  car reference Tesla Object

        boolean isTesla = car instanceof Tesla; // car which is referencing Tesla object has a relationship with Tesla Class - true
        boolean isAudi = car instanceof Audi;
        boolean isElectricCar = car instanceof Electricc;
        //                   car reference Tesla Object
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;

        System.out.println("isTesla = " + isTesla); // true
        System.out.println("isAudi = " + isAudi); // false
        System.out.println("isElectricCar = " + isElectricCar); // true
        System.out.println("hasAutoPark = " + hasAutoPark); // true
        //public class Tesla extends Car implements Electric,AutoPilot,   and AutoPilot extends AutoPark

        System.out.println("hasAutoPilot = " + hasAutoPilot); // true

        System.out.println("---------------------------------------------------------------------------");




    }


}
