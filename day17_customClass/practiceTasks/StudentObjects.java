package day17_customClass.practiceTasks;

public class StudentObjects { // Task2

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setInfo("Ermek",'M',28,"A001",100.0,true);


        Student student2 = new Student();

        student2.setInfo("Boban",'M',32,"A002",100.0,true);


        System.out.println(student1);
        System.out.println(student2);

        student1.study();
        student2.study();



    }

}
