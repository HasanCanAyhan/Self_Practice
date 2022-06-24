package day27_accessModifiers.practiceTasks;

public class TestDogObjects { // Task 3

    public static void main(String[] args) {

        Dog dog1 = new Dog("Golden Retriever","Black",28,"Small",'M',true);

        System.out.println(dog1);

        dog1.eet();
        dog1.drink();
        dog1.sleep();
        dog1.play();
        dog1.bark();

        System.out.println(Dog.numberOfWings);
        System.out.println(Dog.numberOfEyes);
        System.out.println(Dog.numberOfLegs);


    }


}
