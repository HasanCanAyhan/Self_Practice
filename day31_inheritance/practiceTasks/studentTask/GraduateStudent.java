package day31_inheritance.practiceTasks.studentTask;

public class GraduateStudent extends Student{

    private double graduateNote;

    public GraduateStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String grade, String schoolName, double graduateNote) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        setGraduateNote(graduateNote);
    }

    public double getGraduateNote() {
        return graduateNote;
    }

    public void setGraduateNote(double graduateNote) {

        if (graduateNote < 0 || graduateNote > 6){
            System.err.println("Invalid graduateNote: " + graduateNote);
            System.exit(1);
        }

        this.graduateNote = graduateNote;
    }

    @Override
    public void study() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " does not study anymore");
    }


    @Override
    public String toString() {
        return super.toString().replace("}","")+
                "graduateNote=" + graduateNote +
                '}';
    }


}
/*
3. Create the following sub classes of Student class:

                1. GraduateStudent:

                        Override the study method

                        add any additional fields and methods if necessary
 */