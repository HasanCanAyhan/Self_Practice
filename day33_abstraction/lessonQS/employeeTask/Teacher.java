package day33_abstraction.lessonQS.employeeTask;

public class Teacher extends Employee{
    // if we write "public abstract class Teacher" , then we can not create objects from Teacher Class


    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {  // mandatory overridden from Abstract Parent Class, because work method in parent class is not completed.
        System.out.println(getName() + " is teaching");
    }

}
/*
    Teacher:
    	work(){ teaching }
 */