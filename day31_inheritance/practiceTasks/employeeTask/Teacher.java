package day31_inheritance.practiceTasks.employeeTask;

public class Teacher extends Employee{

    private String mainField ;

    public Teacher(String name, String id, String jobTitle, String companyName, int age, char gender, double salary, String mainField) {
        super(name, id, jobTitle, companyName, age, gender, salary);
        setMainField(mainField);
    }

    public String getMainField() {
        return mainField;
    }

    public void setMainField(String mainField) {
        this.mainField = mainField;
    }


    @Override
    public void work() {
        System.out.println(getName() + " is teaching about " + mainField);
    }


    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", mainField='" + mainField + '\'' +
                '}';
    }


}
/*
 3. Teacher
                    work(): name + " is teaching"
 */