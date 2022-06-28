package day29_inheritance.lessonQS.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 4, "Large", "White");

        Cat cat = new Cat();
        cat.setInfo("Felicia", "stray", 'F', 3, "Medium", "Black and White");

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal",  'M', 5, "Large", "Orange");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("-------------------------------------------------------------");

        dog.eat();
        dog.sleep();   // those come from Dog Class , it is inherited to Animal
        dog.drink();


        cat.eat();
        cat.drink(); // those come from Cat Class , it is inherited to Animal
        cat.sleep();


        tiger.eat();
        tiger.drink(); // those come from Tiger Class , it is inherited to Animal
        tiger.sleep();

        System.out.println("------------------------------------------------------");

        dog.bark();
        //cat.bark();
        //tiger.bark()

        cat.meow();
        cat.scratch();
        //dog.meow();
        //tiger.meow();

        tiger.hunt();

        System.out.println("------------------------------------------------------");

        // Object Class : parent of all the classes(implicitly) -import java.lang.Object;


        /*
        System.out.println(dog.name);
        System.out.println(dog.color);

        dog.gender = 'K';
        dog.age = -100;


         */

        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        dog.setGender('F');
        dog.setAge(8);


        System.out.println(dog);

    }

}
