package day36_polymorphism.lessonQS;


import day30_inheritance.lessonQS.phoneTask.Iphone; // Muhtar wrote it as IPhone
import day30_inheritance.lessonQS.phoneTask.Nokia;
import day30_inheritance.lessonQS.phoneTask.Phone;
import day30_inheritance.lessonQS.phoneTask.Samsung;

public class PolymorphismPractice {


    public static void main(String[] args) {

        //   IPhone phone = new Phone("Iphone 11 Pro", "Large", "Black", 900); // object can not reference Parent Object

        //Phone phone =  new Samsung("Galaxy S19", "Medium", "Pink", 700);


        Phone[] phones = {
                new Iphone("Iphone 11 Pro", "Large", "Black", 900),
                new Iphone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new Iphone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Black", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new Iphone("Iphone 12 Pro", "Large", "Black", 1200),
                new Iphone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new Iphone("Iphone 6", "Smalle", "Gold", 400),
                new Iphone("Iphone 7", "Smalle", "White", 500)
        };

        // 1. print the model, color and price of each phone object in the following format

        for (Phone eachPhone : phones) {
            System.out.println(eachPhone.getModel() + " - " + eachPhone.getColor() + " - " + eachPhone.getPrice());
        }

        // 	2. How many Iphones in the array of phones?
        // 	3. How many Samsungs in the array of phones?
        // instanceof

        int countIphone = 0;
        int countSamsung = 0;

        for (Phone eachPhone : phones) {
            // objectType can be many ex: Iphone,Samsung,Nokia...

            //Has object  relationship Iphone class???
            if (eachPhone instanceof Iphone){ // if the phone is Iphone
                countIphone++;
            }

            if (eachPhone instanceof Samsung){// if the phone is samsung
                countSamsung++;
            }


        }

        System.out.println("countIphone = " + countIphone);// 7
        System.out.println("countSamsung = " + countSamsung);// 5

        System.out.println("---------------------------------------------");

        // 4. Display the models of Iphones and samsung that has the price of 700 or greater


        for (Phone each : phones) {

            if (each instanceof  Iphone || each instanceof Samsung){// first, we should find if each object  is Iphone or Samsung
                if (each.getPrice() >= 700 ){
                    System.out.println(each.getModel());
                }
            }

        }








    }

}
/*
Warmup task:
	Given the following array:
		Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new IPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Red", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new IPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new IPhone("Iphone 6", "Smalle", "Gold", 400),
                new IPhone("Iphone 7", "Smalle", "White", 500)
        };


    1. print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many Iphones in the array of phones?

	3. How many Samsungs in the array of phones?

	4. Display the models of Iphones and samsung that has the price of 700 or greater 
 */
