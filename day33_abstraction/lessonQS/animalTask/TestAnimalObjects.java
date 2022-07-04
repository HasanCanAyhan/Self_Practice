package day33_abstraction.lessonQS.animalTask;

public class TestAnimalObjects {

    public static void main(String[] args) {

        Dog dog = new Dog("Larkin","breed",'M');

        Cat cat = new Cat("Mia","breed",'F');

        Fish fish = new Fish("Nemo","breed",'M');

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(fish);

        dog.eat();
        cat.eat();
        fish.eat();



    }

}
