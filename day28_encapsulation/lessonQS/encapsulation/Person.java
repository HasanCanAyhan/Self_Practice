package day28_encapsulation.lessonQS.encapsulation;

import java.time.LocalDate;

public class Person {


    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;


    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        if (name == null){
            return "Unknown";
        }

        return name;
    }

    public void setName(String name) {

        if (name.isEmpty() || name.isBlank()){
            System.err.println("Person name can not be empty or blank");
            System.exit(1);
        }

        this.name = name;
    }

    public int getAge() {

        if (age == 0){
            System.err.println("Age has not been set");
            System.exit(1);
        }

        return age;
    }

    public void setAge(int age) {

        if(age < 0 || age > 120){
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (  !(gender == 'M' || gender == 'F') ){
            System.err.println("Gender can only be 'M' or 'F'  ");
            System.exit(1);
        }

        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {

        if (dateOfBirth.isAfter(LocalDate.now())){
            System.err.println("Birthday can not be after today's date");
            System.exit(1);
        }

        this.dateOfBirth = dateOfBirth;
    }


    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", dateOfBirth=" + getDateOfBirth() +
                '}';
    }
}
/*
Variables :
    name,age,gender,dateOfBirth

    name :
        Write : cannot be null,empty or blank
        Read : if name is null, return "Unknown"  instead

   age:
        Write : age can not be less than zero or grater than 120

   gender:

        Write : gender can only be 'M' or 'F'

   dateOfBirth:

        Write: can not be after today´s date

   Add a constructor that can set all the fields

   Add toString()

 */