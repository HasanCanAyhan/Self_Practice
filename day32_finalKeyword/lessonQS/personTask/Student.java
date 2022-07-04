package day32_finalKeyword.lessonQS.personTask;

import java.time.LocalDate;

public final class Student extends Person{

    private char grade;

    private final String studentId;


    // Constructor
    public Student(String name, char gender, LocalDate dateOfBirth, char grade, String studentId) {
        super(name, gender, dateOfBirth);
        setGrade(grade);
        this.studentId = studentId;
    }

    // Getter
    public char getGrade() {
        return grade;
    }

    public String getStudentId() {
        return studentId;
    }


    // Setter : we have only setGrade , because studentId is final, that's why we can not crate setStudentId method
    public void setGrade(char grade) {
        this.grade = grade;
    }

    //toString


    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" +getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", grade=" + grade +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
