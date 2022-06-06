package day17_customClass.practiceTasks;

public class Student { // Task2

    public String name;
    public char gender;
    public int age;
    public String studentId;
    public double grade;
    public boolean isFulltime;


    public void setInfo(String name, char gender, int age, String studentId, double grade, boolean isFulltime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
        this.isFulltime = isFulltime;
    }

    public void study(){
        System.out.println(name + " studies very well .");
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", grade=" + grade +
                ", isFulltime=" + isFulltime +
                '}';
    }
}
/*
2. Create a custom class named Student
		Attributes:
			name, gender, age, studentId, grade, isFullTime

		Actions:
			setInfo(): sets all the fields of the student object
			toString(): when a car object is passed in print statement,
					it should display all the information of the student object
			study()
 */
