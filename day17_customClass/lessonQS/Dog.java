package day17_customClass.lessonQS;

public class Dog { // we create this class for creating object


    // You don´t have to create main method

    // Instance Variable
    public String name; // instance variable ,  every object has different name   // 10 object 10 separate copy name
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

                         // "Max"    ,  "Husky"     ,  'M'       ,   4   ,   "small",        "White"
    public void setInfo(String name, String breed , char gender , int age, String size , String color){ // local variable

        this.name = name; // this keyword is used for calling the instance variable name
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }// this method can help us to set all the information of the dog at once



    //Instance Methods/Actions

    // Note:
    // static means one copy
    // instance means multiply copy


    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking water");

    }


    // To String method is instance method and  for displaying on the console

    /*
    public String toString(){
        return "Dog Name: " + name + ", Dog Gender " + gender;
    }


     */

    public String toString() { // to avoid getting hashcode when we print the class objects
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
