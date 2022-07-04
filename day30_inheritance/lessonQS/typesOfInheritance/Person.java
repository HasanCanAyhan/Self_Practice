package day30_inheritance.lessonQS.typesOfInheritance;

import java.time.LocalDate;

public class Person {

    /*
    OOP Inheritance:
        to build IS A relationship between the classes(parent/child, super/sub)
        easiest way to get rich ===>> extends

        Child class (sub) : can inherit all the variables & methods that are accessible/visible from the parent class
        Parent class (super) : can NOT inherit anything from child class, contains all the common features(variables/methods) of all child classes

        Class A extends Class B  :>> A : child , B:Parent

        Constructor: has to have the same with the class, because of that can not be inherited.
                     Child class must call one of the parent class' constructor

        Advantages:

        1) less codes
        2) improves the reusability
        3) clean coding
        4) less memory usage
        5) easy to maintain if something would change.

        - One class can ONLY extend one class
        - One class can be extended by Multiple Classes


        - Type Of Inheritance :

            Single : Parent -> Child
            Hierarchical : Parent -> Child 1
                                  -> Child 2
            Multilevel : Parent -> Child -> Grandchild


            Multiple : Parent 1 & Parent 2 -> child   (NOT SUPPORTED BY JAVA!)

     */


    private String name;
    private int age;
    private char gender;
    private LocalDate DOB;// date of birth

    public Person(String name, char gender, LocalDate DOB) {// 3 parameters, because we can find age from the date of birth
        setName(name);
        setGender(gender);
        setDOB(DOB);
        setAge( LocalDate.now().getYear() - DOB.getYear());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age <= 0){
            System.err.println("Invalid age: " +age);
            System.exit(1);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }


    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return   getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DOB=" + DOB +
                '}';
    }
}
