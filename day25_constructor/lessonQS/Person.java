package day25_constructor.lessonQS;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    public String name;
    public char gender;
    public LocalDate dateOfBirth;
    public boolean isMarried;
    public boolean isEmployed;


    public Person(String name, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }

    public String eat(String food){

        return name + " is eating " + food;
    }

    public void sleeping(){
        System.out.println(name + " is sleeping right now");
    }

    public String drink(String drink){
        return name + " is drinking " + drink;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                 ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("M/dd/y")) +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }

}
/*
name,age,gender, dateOfBirth, isMarried, isEmployed

Add a constructor that can set all the fields once an object is created

toString(), dateOfBirth format mm/dd/y

to eat(String food) , sleeping() , drink(String drink)

5 person object

 */