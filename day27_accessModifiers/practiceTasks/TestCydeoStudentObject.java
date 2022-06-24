package day27_accessModifiers.practiceTasks;

public class TestCydeoStudentObject { // Task 2

    public static void main(String[] args) {


        CydeoStudent student1 = new CydeoStudent("Can",'M',27,"GR07");

        System.out.println(student1);

        student1.attendClass();
        student1.study();

        CydeoStudent.printSchoolName();
        CydeoStudent.printSecretCode();
        System.out.println(CydeoStudent.programmingLanguage);
        System.out.println(CydeoStudent.batchNumber);
        System.out.println(CydeoStudent.fieldOfStudy);


    }

}
