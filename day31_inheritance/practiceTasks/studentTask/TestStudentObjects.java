package day31_inheritance.practiceTasks.studentTask;

public class TestStudentObjects {

    public static void main(String[] args) {


        GraduateStudent graduateStudent = new GraduateStudent("Can",27,'M',"A1","Mechanical Eng","A","ITÜ",3.56);

        System.out.println(graduateStudent);

        graduateStudent.study();

        System.out.println("----------------------------------------------------");

        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Josh",20,'M',"B1","IT","A","Darmstadt Uni");

        undergraduateStudent.study();

        System.out.println(undergraduateStudent);

        System.out.println("-----------------------------------");

        CydeoStudent cydeoStudent = new CydeoStudent("Hasan Can",27,'M',"A123","JAVA Dev","A","CydeoSchool",1,7,"Java Programming Language");

        cydeoStudent.eat();
        cydeoStudent.drink();
        cydeoStudent.sleep();

        System.out.println(cydeoStudent);


    }

}
/*
4. Create a class named StudentObjects:

                        Create the objects of each sub classes

                        test all the functions of each objects

                        Analyze the relationships between the classes
 */
