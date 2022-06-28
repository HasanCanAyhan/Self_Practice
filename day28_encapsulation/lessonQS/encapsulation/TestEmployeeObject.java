package day28_encapsulation.lessonQS.encapsulation;

public class TestEmployeeObject {

    public static void main(String[] args) {

        /*
        Employee employee1 = new Employee();

        //employee1.salary = -200000;


        employee1.setSalary(100000);

        System.out.println( employee1.getSalary()  );

        System.out.println("--------------------------------------");

       // employee1.setName("     ");

        System.out.println(  employee1.getName()); // default value : null


         */


        Employee employee1 = new Employee("Can",28,"Java Dev",25000);

        System.out.println(employee1);




    }


}
