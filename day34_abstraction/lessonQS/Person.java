package day34_abstraction.lessonQS;

import day34_abstraction.lessonQS.animalTask.Playable;
import day34_abstraction.lessonQS.animalTask.Swimmable;

public class Person implements Playable, Swimmable {
    @Override
    public void play() {
        System.out.println("Playable interface  6");
    }

    @Override
    public void swim() {
        System.out.println("Swimmable interface  4");
    }
}
