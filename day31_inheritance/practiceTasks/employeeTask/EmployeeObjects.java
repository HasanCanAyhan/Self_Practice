package day31_inheritance.practiceTasks.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester("Can","A1","Java SDET","Cydeo School",27,'M',80000);
        tester.work();
        System.out.println(tester);

        System.out.println("------------------------");

        Developer developer = new Developer("Hasan Can","A2","Java Dev","Cydeo School",28,'M',100000,"Java P.L.");
        developer.work();
        System.out.println(developer);

        System.out.println("------------------------------------");

        Teacher teacher = new Teacher("Muhtar","A01","Java Teacher","Cydeo School",32,'M',150000,"Back- end Dev");
        teacher.work();
        System.out.println(teacher);

        System.out.println("---------------------------");


        Driver driver = new Driver("Josh","C1","Driver","Cydeo School",35,'M',90000,"B & E");
        driver.work();
        System.out.println(driver);


    }

}
