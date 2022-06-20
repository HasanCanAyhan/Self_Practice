package day26_statics;

public class TestCarObjects {


    public static void main(String[] args) {


        Car car1 = new Car("BMW");
        System.out.println(car1);
        //Car{make='BMW', model='null', year=0, price=0.0, color='null'}

        Car car2 = new Car("Audi","Q4");
        System.out.println(car2);
        //Car{make='Audi', model='Q4', year=0, price=0.0, color='null'}

        Car car3 = new Car("Toyota","Camry",2021);
        System.out.println(car3);
        //Car{make='Toyota', model='Camry', year=2021, price=0.0, color='null'}

        Car car4 = new Car("Honda","Accord",2020,30000);
        System.out.println(car4);
        //Car{make='Honda', model='Accord', year=2020, price=30000.0, color='null'}

        Car car5 = new Car("Lexus","RX350",2019,40000,"Black");
        System.out.println(car5);
        //Car{make='Lexus', model='RX350', year=2019, price=40000.0, color='Black'}







    }

}
