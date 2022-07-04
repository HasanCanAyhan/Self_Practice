package day31_inheritance.practiceTasks.studentTask;

public class Person { // Task 3

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {

        if (name == null){
            System.err.println("Unknown");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty() ){
            System.err.println("Invalid! Name should not be empty");
            System.exit(1);
        }

        for (char each : name.toCharArray()) {
            if (!Character.isLetterOrDigit(each) && !name.contains(" ")){
                System.err.println("Invalid name: " + name);
                System.exit(1);
            }
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0) {
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (  !(gender == 'M'  || gender == 'F' ) ){
            System.err.println("Invalid gender: " +gender);
            System.exit(1);
        }

        this.gender = gender;
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


    public String toString() {
        return  getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }



}
/*
Student Task:
    1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields

            Add a constructor that can set all the fields

                    Condition:
                        1. name should not be set to null
                        2. name should not be empty
                        3. name should not contain any special character other than space
                        4. age should not be set to negative
                        5. gender must be valid

            Methods:
                eat()
                drink()
                sleep()
                toString()


    2. Create a subclass of Person named Student:
                Extra variables:
                        studentId, fieldOfStudy, grade, schoolName

                Encapsulate all the fields

                Add a constructor that can set all the fields

                            Condition:
                                    1. filedOfStudy and schoolName should not be set to null
                                    2. filedOfStudy and schoolName should not be empty
                                    3. grade must be valid (A, B, C, D, F)


                Extra methods:
                    study()
                    toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included



    3. Create the following sub classes of Student class:

                1. GraduateStudent:

                        Override the study method

                        add any additional fields and methods if necessary

                2. UndergraduateStudent

                        Override the study method

                        add any additional fields and methods if necessary

                3. CydeoStudent:

                        Extra Variables:
                            batchNumber, groupNumber, programmingLanguage

                        Encapsulate all the fields

                        Add a constructor that can set all the fields

                                Condition:
                                    1. batchNumber and groupNumber should not be set to zero or negative
                                    2. programmingLanguage should not be set to null
                                    3. programmingLanguage should not empty


                        Override the eat, drink and sleep methods (programmingLanguage need to be included)

                        Override the toString method:
                                name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber, groupNumber, programmingLanguage should be included


                4. Create a class named StudentObjects:

                        Create the objects of each sub classes

                        test all the functions of each objects

                        Analyze the relationships between the classes
 */