package day32_finalKeyword.lessonQS.personTask;


import java.time.LocalDate;

public class Person {

       /*
    If we declare the variables as static,
    it(static) means there will be only one copy of each variable for all objects.
    But we are trying to create different instances/objects.
    We use final to make the variables of each object unchangeable.
     */


    private String name;
    private final char gender;  // no default value , you should assign before using
    private final int age; //--->> it only has getter, no setter
    private final LocalDate dateOfBirth;

    public static final int numberOfHead;


    static {
        numberOfHead = 1;
    }

    public Person(String name, char gender, LocalDate dateOfBirth) {
        setName(name);
        //Condition has to be , before assigning
        if(!(gender == 'M' || gender == 'F')){
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();


    }

    // For Final : only generated Getters because final is not changeable because of that there is no setters

    /*
     **** If the instance variable is final , we can only getter , we can not  generate setter for it !!!!
     */

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    // Setter, only setName

    public void setName(String name) {
        this.name = name;
    }


    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }


    // final method
    public final void breath(){ // to make sure that this implementation will not change for any sub class
        System.out.println(name + " is breathing");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
/*
Variables :
    name, gender, age, dateOfBirth --->> gender , age ,dateOfBirth are final
    numberOfHead

Methods :
    eat(), drink(), sleep()
    breath()

 */