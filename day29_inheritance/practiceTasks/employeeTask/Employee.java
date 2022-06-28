package day29_inheritance.practiceTasks.employeeTask;

public class Employee { // Task 1


    private String name , id , jobTitle;
    private char gender;
    private int age;
    private double salary;


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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if(  !(gender == 'M' || gender == 'F' ) ){
            System.err.println("gender can only be 'M' or 'F': " + gender);
            System.exit(1);
        }

        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0 ){
            System.err.println("age can not be negative: " + age);
            System.exit(1);
        }else if(( age < 18 || age > 65)){
            System.err.println(" age MUST be between 18 to 65: " +age);
            System.exit(1);
        }

        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0 ){
            System.err.println("salary can not be negative");
            System.exit(1);
        }

        this.salary = salary;
    }

    public void setInfo(String name, String id, String jobTitle, char gender, int age, double salary) {
        setName(name);
        setId(id);
        setJobTitle(jobTitle);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    // toStirng


    public String toString() {
        return  getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


}
/*
employeeTask:
	1. Create a custom Class named Tester
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be nagative
					3. age MUST be between 18 to 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				testing()
				toString(): prints tester object info when the object is passed in the print statement


	2. Create a custom Class named Developer

			Variables:
				name, gender, age, id, jobTitle, salary, programmingLanguage

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be nagative
					3. age MUST be between 18 to 65
					4. salary can not be negative
					5. programming language can only be set to one of the followings:
						{"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}

			Methods:
				setInfo(): sets all the fields (including programmingLanguage)
				coding()
				toString(): prints developer object info when the object is passed in the print statement


	3. Create a custom Class named Teacher
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be nagative
					3. age MUST be between 18 to 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				teching()
				toString(): prints teacher object info when the object is passed in the print statement

	4. Create a custom Class named Driver
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be nagative
					3. age MUST be between 18 to 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				testing()
				toString(): prints driver object info when the object is passed in the print statement
 */