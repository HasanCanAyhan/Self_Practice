package day34_abstraction.lessonQS.animalTask;

public class Duck extends Animal implements Playable,Flyable, Swimmable{

    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dog " + getName() + " is eating a small fish" );
    }

    @Override
    public void play() {
        System.out.println("Playable Interface 3");
    }

    @Override
    public void fly() {
        System.out.println("Flyable-interface 2");
    }

    @Override
    public void swim() {
        System.out.println("Swimmable interface 2");
    }
}
