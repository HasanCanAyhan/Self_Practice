package day32_finalKeyword.lessonQS.personTask;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {


        Person person = new Person("Daniel", 'M', LocalDate.of(1991,1,25));

        System.out.println(person);
        //person.setGender(); there is no setGender method, because gender variable is final, it can not change.

        person.breath();

        System.out.println("----------------------------");

        Employee employee = new Employee("Emily", 'F', LocalDate.of(1989, 2, 5), "Accountant", 100000);

        System.out.println(employee);

        employee.breath();


        System.out.println("----------------------------------------");

        Student student = new Student("Can",'M',LocalDate.of(1994,3,26),'A',"A1");
        System.out.println(student);
        student.breath();





    }

}
