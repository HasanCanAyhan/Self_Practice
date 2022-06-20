package day17_customClass.lessonQS;

public class Employee {

    // 6 attributes-instance variable
    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public String id;

                                                // we have 6 arguments
    public void setInfo(String name, int age, char gender, String jobTitle, double salary, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
    }// sets all the attributes of the Employee object at once

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    } // to avoid getting hash code when we print employee object and it is instance metthod

    public void work(){
        System.out.println(name + " is working");
    }   // instance method



}
