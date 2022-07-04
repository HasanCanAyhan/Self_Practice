package day31_inheritance.practiceTasks.employeeTask;

public class Driver extends Employee{

    private String drivingLicence;

    public Driver(String name, String id, String jobTitle, String companyName, int age, char gender, double salary, String drivingLicence) {
        super(name, id, jobTitle, companyName, age, gender, salary);
        setDrivingLicence(drivingLicence);
    }

    public String getDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(String drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", drivingLicence='" + drivingLicence + '\'' +
                '}';
    }


}
