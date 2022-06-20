package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {

    public String groupName;
    public String groupId;

    public ArrayList<Student> students;

    public StudentsGroup(String groupName, String groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
        this.students = new ArrayList<>();
    }

    public  ArrayList<Student> addStudent(Student student){

        students.add(student);
        System.out.println(student + " is added to studentsList");

        return students;
    }

    public void addStudent( String name, int age, char gender, String id){

        //1.Way
        //Student student = new Student(name,age,gender,id);
        //students.add(student);

        students.add( new Student(name,age,gender,id));

    }

    public ArrayList<Student> addStudent(Student[] students){

        this.students.addAll(Arrays.asList(students));

        return this.students;
    }

    public ArrayList<Student> removeStudent(String id){

        students.removeIf(p -> p.id.equals(id));
        System.out.println(id + " id number of student is removed");

        return students;
    }

    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId='" + groupId + '\'' +
                ", total number os students='" + students.size() + '\'' +
                '}';
    }


}
/*
2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constrcutor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */