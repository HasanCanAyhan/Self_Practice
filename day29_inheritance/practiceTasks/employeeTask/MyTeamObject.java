package day29_inheritance.practiceTasks.employeeTask;

public class MyTeamObject {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Can","A1","Java SDET",'M',27,85000);

        tester1.testing();

        System.out.println(tester1);

        System.out.println("--------------------------------------");

        Developer developer1 = new Developer();
        developer1.setInfo("Josh","A2","Java Developer",'M',28,100000);

        developer1.setProgrammingLanguage("Java");

        developer1.coding();


        System.out.println(developer1);

        System.out.println("-------------------------------------------------------------");

        Teacher teacher1 = new Teacher();
        teacher1.setInfo("Muhtar","A3","Teacher for Java Developer",'M',27,150000);

        teacher1.teaching();

        System.out.println(teacher1);

        System.out.println("--------------------------------------------------------------");

        Driver driver1 = new Driver();
        driver1.setInfo("Daniel","A4","Java Driver",'M',30,1000000);

        driver1.testing();

        System.out.println(driver1);

    }


}
