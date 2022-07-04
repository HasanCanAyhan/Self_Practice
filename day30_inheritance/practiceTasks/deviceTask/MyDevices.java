package day30_inheritance.practiceTasks.deviceTask;

public class MyDevices {

    public static void main(String[] args) {

        // Subclasses of Device : Phone-TV-Computer

        Phone phone = new Phone("Iphone","X","Black","Large",1500,true,true);
        TV tv = new TV("Simens","SX12","Black","Medium",1250,true,true);
        Computer computer = new Computer("Asus","A1550","Black","Large",750,true,true,8);



        // Subclasses of Phone : Iphone-Samsung-BlackBerry-Google-Nokia

        Iphone iphone = new Iphone("Iphone","X","Black","Large",1500,true,true);
        Samsung samsung = new Samsung("Galaxy","S10","Gold","Large",1100,true,true);




        // Subclasses of Computer : 1. PersonalComputer2. Desktop 3. Laptop

        PersonalComputer personalComputer = new PersonalComputer("Asus","A1550","Black","Large",750,true,true,8);

        // Subclasses of TV : 1. Smart TV

        SmartTV smartTV = new SmartTV("LG","12","Black","HD-Smart",1575,true,true);

        System.out.println(phone);
        System.out.println(tv);
        System.out.println(computer);

        System.out.println("------------------------------");

        System.out.println(iphone);
        System.out.println(samsung);

        System.out.println("-----------------------------------");

        System.out.println(personalComputer);

        System.out.println(smartTV);

    }

}
