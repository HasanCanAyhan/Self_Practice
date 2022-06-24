package day27_accessModifiers.practiceTasks;

public class Dog { // Task 3

    public String breed,color;
    public int age;
    public String size;
    public char gender;
    public boolean isFriendly;

    public static int numberOfLegs;
    public static int numberOfEyes;
    public static int numberOfWings;


    public Dog(String breed, String color, int age, String size, char gender, boolean isFriendly) {
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.size = size;
        this.gender = gender;
        this.isFriendly = isFriendly;
    }

    static {
        numberOfEyes = 2;
        numberOfLegs = 4;
        numberOfWings = 1;
    }

    public void eet(){
        System.out.println("The dog is eating.");
    }

    public void drink(){
        System.out.println("Th dog is drinking");
    }

    public void sleep(){
        System.out.println("The dog is sleeping");
    }

    public void play(){
        System.out.println("The god is playing");
    }

    public void bark(){
        System.out.println("The dog is barking");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", isFriendly=" + isFriendly +
                '}';
    }
}
/*

3.  Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
 */