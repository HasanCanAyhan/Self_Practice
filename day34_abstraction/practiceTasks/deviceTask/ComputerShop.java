package day34_abstraction.practiceTasks.deviceTask;

public class ComputerShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple","12",1500,"Black","Large",true,true);

        Samsung samsung = new Samsung("Samsung","S Galaxy",1200,"Gold","Medium",true,true);

        Google google = new Google("Google","Google X",1700,"White","Large",true,true);

        PersonalComputer personalComputer = new PersonalComputer("Lenova","SLX10",950,"Silver","Large",true,true);

        Desktop desktop = new Desktop("HP","E2570",799,"Metal","Large",true,true);

        Laptop laptop = new Laptop("Asus","A550",950,"Black","Large",true,true);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(google);
        System.out.println(personalComputer);
        System.out.println(desktop);
        System.out.println(laptop);

        iphone.turnOn();
        iphone.turnOff();
        iphone.call(12345);
        iphone.text(12345);
        iphone.downloadApp();
        samsung.downloadApp();
        google.downloadApp();

        System.out.println("-------------------------------------------------");

        System.out.println(Iphone.appStoreName);
        System.out.println(Iphone.OS);

        System.out.println(Samsung.appStoreName);
        System.out.println(Samsung.OS);





    }

}
/*
9. Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes
 */
