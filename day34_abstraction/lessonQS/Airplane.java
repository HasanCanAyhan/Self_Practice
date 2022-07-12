package day34_abstraction.lessonQS;

import day34_abstraction.lessonQS.animalTask.Flyable;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flyable interface 4");
    }
}
