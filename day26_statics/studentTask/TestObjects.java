package day26_statics.studentTask;

import java.util.Arrays;

public class TestObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Hasan",27,'M',"A123");
        Student student2 = new Student("Can",27,'M',"A124");
        Student student3 = new Student("Lucy",27,'F',"A125");
        Student student4 = new Student("Aras",27,'M',"A126");
        Student student5 = new Student("Esra",27,'F',"A127");


        Student[] studentsArr = {student1,student2,student3,student4,student5};

        StudentsGroup group1 = new StudentsGroup("First Group","A1");

        group1.addStudent(student1);

        System.out.println(group1);

        System.out.println("--------------------------");

        group1.removeStudent("A123");

        System.out.println(group1);

        System.out.println("--------------------------");


        group1.addStudent(studentsArr);

        System.out.println(group1);


        group1.addStudent("ArasEmir",28,'M',"A122");


        System.out.println(group1);

        for (Student each : group1.students) {

            System.out.println(each.name);
        }

        System.out.println("---------------------------");


        group1.removeStudent("A123");

        System.out.println(group1);




    }


}
/*
3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
 */