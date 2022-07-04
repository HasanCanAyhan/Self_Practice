package day31_inheritance.lessonQS.animal_methodOverriding;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    /*
    @Override
    public void eat(){ // only one eat method created inside the Animal Class
        // Execution depends on object ex : cat.eat() , animal.eat()
        System.out.println("Cat "+getName() + " is eating cat food");
    }
     */


    // shortcut : generate -> Override Methods
    @Override
    public void eat() { // overridden method
        System.out.println("Cat "+getName() + " is eating cat food");
    }

    @Override
    public void sleep() { // overridden method
        System.out.println("Cat "+getName()  + " sleeps 12 hours in a day");
    }

    public  void scratch(){ // different method-unique
        System.out.println("Cat " + getName() + " is scratching");
    }




}
