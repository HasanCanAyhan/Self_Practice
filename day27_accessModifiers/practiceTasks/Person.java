package day27_accessModifiers.practiceTasks;

public class Person { // Task 4

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean hasNose;
    public static boolean isHuman;
    public static int numberOfWings;
    public static int numberOfHead;


    // Add a constructor to initialize all the fields


    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    //  Add a static block to initialize all the statics
    static {
        planet = "Planet Earth";
        hasNose = true;
        isHuman = true;
        numberOfWings = 0;
        numberOfHead = 1;

    }

    public static void printPlanetName(){
        System.out.println("planet = " + planet);
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                '}';
    }

}
/*
4.Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()
 */