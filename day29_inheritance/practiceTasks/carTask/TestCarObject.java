package day29_inheritance.practiceTasks.carTask;

public class TestCarObject {

    public static void main(String[] args) {

        Toyota toyota = new Toyota();
        toyota.setInfo("Toyota","model","White",2022,150000);

        System.out.println(toyota);

        System.out.println("------------------------------");

        Honda honda = new Honda();
        honda.setInfo("Honda","model","Black",2021,100000);

        System.out.println(honda);

        System.out.println("----------------------------");

        BMW bmw = new BMW();
        bmw.setInfo("BMW","model","Red",2020,150000);

        System.out.println(bmw);

        System.out.println("-------------------------------------");

        Mercedes mercedes = new Mercedes();
        mercedes.setInfo("Mercedes","model","Red",2022,250000);

        System.out.println(mercedes);

        System.out.println("--------------------------------");

        Audi audi = new Audi();
        audi.setInfo("Audi","model","Red",2019,251000);

        System.out.println(audi);

        System.out.println("-------------------------");

        Volvo volvo = new Volvo();
        volvo.setInfo("Volvo","model","Red",2018,12000);

        System.out.println(volvo);

    }

}
