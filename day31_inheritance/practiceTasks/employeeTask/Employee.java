package day31_inheritance.practiceTasks.employeeTask;

public class Employee { // task 4

    private String name,id,jobTitle,companyName;
    private int age;
    private char gender;
    private double salary;


    public Employee(String name, String id, String jobTitle, String companyName, int age, char gender, double salary) {
        setName(name);
        setId(id);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setAge(age);
        setGender(gender);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18){
            System.err.println("Invalid age: " +age);
            System.exit(1);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if ( !(gender == 'M' || gender == 'F')  ){
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }

        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0 ){
            System.err.println("Invalid salary: " +salary);
            System.exit(1);
        }

        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " is working");
    }


    public String toString() {
        return   getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }


}
/*
employeeTask:
    1. Create a class named Employee
            Variables:
                name, age, gender, id, jobTitle, salary, comapnyName

            Encapsulate all the fields
                condition:
                    1. Age can not be zero or negative
                    2. Age can not be less than 18
                    3. gender can only be set to 'M' or 'F'
                    4. salary can not be negative

            Add a constructor to set all the fields

            Methods:
                work(): prints name + " is working"
                toString()


    2. Create ethe following subclasses and override the work method in each subclass:

            1. Tester
                    work(): jobTitle + " " + name + " is testing"

            2. Developer
                    Extra variable:
                        programmingLanguage

                    work(): jobTitle + name + " is coding in "+programmingLanguage

            3. Teacher
                    work(): name + " is teaching"

            4. Driver
                    work(): name + " is driving"


            if any adidtional field or methods needed, please add them
 */
