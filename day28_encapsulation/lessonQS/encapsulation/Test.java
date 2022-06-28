package day28_encapsulation.lessonQS.encapsulation;

public class Test {

    public static void main(String[] args) {


        Student student = new Student();
        //student.age = -200;

        //System.out.println( student.getAge() );// default value: 0

        System.out.println("---------------------------------------");

        student.setAge(25);

        System.out.println(student.getAge());


        //student.setName("Aaron123");

        System.out.println( student.getName());






    }


}
