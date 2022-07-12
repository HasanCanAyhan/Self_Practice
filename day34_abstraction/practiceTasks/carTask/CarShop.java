package day34_abstraction.practiceTasks.carTask;

public class CarShop {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota","Toyota X",2022,75000,"Black");
        Honda honda = new Honda("Honda","Honda SLX",2021,85000,"White");
        BMW bmw = new BMW("BMW","X5",2009,120000,"Black");
        Audi audi = new Audi("Audi","Q6",2018,90000,"Silver");
        Mercedes mercedes = new Mercedes("Mercedes","E10",2022,170000,"Black");
        Tesla tesla = new Tesla("Tesla","Model Y",2022,195000,"Black");
        Nio nio = new Nio("Nio","Model X",2022,200000,"Red");
        CydeoCar cydeoCar = new CydeoCar("Cydeo","Model 1",2022,250000,"Blue");

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(mercedes);
        System.out.println(tesla);
        System.out.println(nio);
        System.out.println(cydeoCar);

        toyota.start();
        honda.drive();
        bmw.start();
        audi.autoPark();
        mercedes.autoPark();
        tesla.autoPark();
        tesla.selfDrive();
        nio.autoPark();
        nio.selfDrive();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.fly();


    }

}
/*
	11. Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes
 */