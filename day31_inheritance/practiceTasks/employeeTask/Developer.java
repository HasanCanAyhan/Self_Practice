package day31_inheritance.practiceTasks.employeeTask;

public class Developer extends Employee{

    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Developer(String name, String id, String jobTitle, String companyName, int age, char gender, double salary, String programmingLanguage) {
        super(name, id, jobTitle, companyName, age, gender, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is coding in "+ programmingLanguage);
    }


    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }



}


/*
   2. Developer
                    Extra variable:
                        programmingLanguage

                    work(): jobTitle + name + " is coding in "+programmingLanguage
 */