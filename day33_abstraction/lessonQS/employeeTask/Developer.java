package day33_abstraction.lessonQS.employeeTask;

public class Developer extends Employee{
    // it shouldn´t be abstract class, because we want to crate object from Developer class

    private String programmingLanguage;

    public Developer(String name, int age, char gender, String id, String jobTitle, double salary, String programmingLanguage) {
        super(name, age, gender, id, jobTitle, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }


    @Override
    public void work() { // overridden from abstract parent class
        System.out.println(getName() + " is coding in " + programmingLanguage);
    }


    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", programming language=" + programmingLanguage + "}";
    }

}
/*
Developer:

        variable : programmingLanguage;
		work() { coding }
 */