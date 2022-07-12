package day34_abstraction.lessonQS.animalTask;

public class Dolphin extends Animal implements Playable,Swimmable{

    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin " + getName() + " is eating fish" );
    }

    @Override
    public void play() {
        System.out.println("Playable Interface 5");
    }

    @Override
    public void swim() {
        System.out.println("Swimmable interface 1");
    }
}
