package day26_statics.practiceTasks;

public class TestCydeoStudentObjects { // Task1

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Can",27,'M',"A123","Good",01,01);


        System.out.println(student1);

        student1.study();
        student1.attendClass();

        System.out.println("----------------------");

        CydeoStudent.printSchoolName(); // static methods
        CydeoStudent.printProgLanguage(); // static methods



    }


}
