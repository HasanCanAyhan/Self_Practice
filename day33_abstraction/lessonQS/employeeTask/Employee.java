package day33_abstraction.lessonQS.employeeTask;

public abstract class Employee { // parent is abstract class , that means it doesn´t create any objects

    /*
       Abstract Class:

        - Super (parent) class is responsible to provide
        the variables and methods that are needed to
        the all the sub classes without worrying about
        the small details

        - Sub (child) classes are responsible for providing the implementations that are needed

        • A class that’s meant to be a parent (super) class

        • Goal is to provide reusable variables and methods to sub classes

        • Abstract keyword is used to create the abstract class

        • An abstract class can not be instantiated
     */

    private String name;
    private int age;
    private char gender;
    private String id;
    private String jobTitle;
    private double salary;


    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        setGender(gender);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
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
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /*
    Abstract Method: ( Method without the body (implementation) )

        • A method that does not have body, only signature

        • A method that’s meant to be overridden

        • Abstract keyword is used to create abstract method


      Abstract Method Rules: - like method overriding

        • An abstract method can not be static

        • An abstract method can not be final

        • An abstract method can not have private access modifier

        • An abstract method does not have body

        • An abstract method can only be created in an abstract class or in an interface
     */

    public abstract void work();   // Method without the body (implementation)
    // it can be only created in Abstract class or in interface
    // abstract method (uncompleted method)
    // it can be any return type
    // Parent class abstract method must be overridden in child(non-abstract) class
    // Sub (child) classes are responsible for providing the implementations that are needed


    public String toString() {
        return   getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


}
/*
employeeTask

	Employee:
		Variables:
			name, age, gender, id, jobTitle, salary ....

		Methods:
		  abstract work();

    Teacher:
    	work(){ teaching }


	Developer:
		work() { coding }

	Tester:
		work(){ testing }

	Driver:
		work() { driving }

	...
 */