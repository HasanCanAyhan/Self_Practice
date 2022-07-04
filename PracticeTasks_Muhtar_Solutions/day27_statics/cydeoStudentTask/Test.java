package PracticeTasks_Muhtar_Solutions.day27_statics.cydeoStudentTask;

public class Test {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Jimmy", 39, 'M', 14, 25, 16, 'C');

        CydeoStudent student2 = new CydeoStudent("Kathy", 29, 'F', 15, 25, 13, 'A');

        System.out.println(student1);
        System.out.println(student2);

        student1.printSchoolName();
        student1.programmingLanguage();
        student2.printSchoolName();
        student2.programmingLanguage();

    }

}
