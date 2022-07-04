package day33_abstraction.lessonQS.animalTask;

public class Dog extends Animal {

    public Dog(String name, String breed, char gender) {
        super(name, breed, gender);
    }

    @Override
    public void eat() {
        System.out.println("Dog "+ getName() + " is eating dog food");
    }


}
