package day17_customClass.practiceTasks;

public class CarObjects { // Task 1

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setInfo("Mercedes","G-Class SUV",2022,"Grey",131.750 );


        Car car2 = new Car();

        car2.setInfo("Audi","RS 6 Avant",2022,"Red",112.000);


        Car car3 = new Car();

        car3.setInfo("Volvo","XC90",2021,"White",70.250);




        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car1.start();






    }





}
/*
1. Create a custom class named Car
		Attributes:
			make, model, year, color, price

		Actions:
			setInfo(): sets all the fields of the car object
			toString(): when a car object is passed in print statement, it should display all the information of the car object
			start()
 */