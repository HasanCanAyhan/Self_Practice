package day35_polymorphism.lessonQS;

import day33_abstraction.lessonQS.shapeTask.Circle;
import day34_abstraction.lessonQS.animalTask.*;



public class PolymorphismIntro {

    public static void main(String[] args) {

        Dog dog = new Dog("Max","Husky",'M',4,"Small","White");

        Cat cat = new Cat("Max","Husky",'M',4,"Small","White");

        Tiger tiger = null;
        Eagle eagle = null;
        Lion lion = null;
        Parrot parrot = null;
        Dolphin dolphin = null;
        Shark shark = null;
        Duck duck = null;

        Animal[] animals = {dog,cat,tiger,eagle,lion,parrot,dolphin,shark,duck};
        // all objects have a relationship with Animal-Parent class

        Animal animal = new Dog("Max","Husky",'M',4,"Small","White");
        animal.eat();
        animal.drink();
        animal.sleep();

        //animal.play();
        //animal.bark(); because there is no in the reference type(Parent)

        // Parent/Reference type decide what will be called, child class decide what will be implementation


        System.out.println("-----------------------------------------------------");

        String str = "Java";

        Integer n = 100;

        Boolean r = false;

        Double d = 10.5;

        Circle circle = new Circle(4);



        System.out.println("----------------------------------------------------------");







    }

}
