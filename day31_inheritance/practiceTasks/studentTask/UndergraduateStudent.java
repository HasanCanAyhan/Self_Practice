package day31_inheritance.practiceTasks.studentTask;

public class UndergraduateStudent extends Student{


    public UndergraduateStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " must study a lot.");
    }




}
/*
   2. UndergraduateStudent

                        Override the study method

                        add any additional fields and methods if necessary
 */