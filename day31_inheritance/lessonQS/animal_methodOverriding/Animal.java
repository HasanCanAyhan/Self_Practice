package day31_inheritance.lessonQS.animal_methodOverriding;

public class Animal {

    /*
    METHOD OVERRIDING
        - giving different implementations to the method
        - One method having multiple different implementations
        - Overriding a method must take place in subclass
        - Less memory usage and Improves the reusability of our code


    RULES:
        - Must happen in the sub class
        - Return type , method name and parametres of the overridden method must be same
        - Access modifier of the overridden method needs to be same or more visible
        - We can not override methods with private access modifier, or with static & final specifiers
        - Only the instance methods (not private & not final) can be overridden



     */

    private  String name, breed;
    private char gender;
    private int age;
    private String size, color;


    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Methods

    public void drink(){
        System.out.println(name + " is drinking water");
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void sleep(){
        System.out.println(name + " sleeps 8 hours");
    }


    public String toString() {
        return   getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }




}
