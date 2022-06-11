package day21_multiDimentionalArray.practiceTasks;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ItemsArray {

    public static void main(String[] args) {


        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"}, // 1. 1D Array
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},// 2. 1D Array
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}// 3. 1D Array
        };

        // 1. print the following output: (add \t between two words)
        for (String[] each1DArr : items) {
            for (String eachElement : each1DArr) {
                System.out.print(eachElement + "\t");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------");

        // 2. print the following output: (add \t between two words) - reversed

        // with the method  ArraysUtility.reverse()


        for (int i = 0; i < items.length; i++) {

            String[] each1DArr = ArraysUtility.reverse(items[i]);

            for (String eachElement : each1DArr) {
                System.out.print(eachElement + "\t");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------");

        // 3. print the following output: (add \t between two words)

        for (int i = items.length - 1; i >= 0; i--) { // 1D Arrays

            String[] each1DArr = items[i];

            for (String eachElement : each1DArr) {
                System.out.print(eachElement + "\t");
            }
            System.out.println();
        }


        System.out.println("-----------------------------------------");


        // 2.QS without using the reverse method from ArraysUtility

        for (String[] each1DArr : items) {

            String[] reversed =  new String[each1DArr.length];

            for (int i = each1DArr.length - 1, j = 0 ; i >= 0; i--, j++) {

                reversed[j] = each1DArr[i];


            }

            for (String eachElement : reversed) {
                System.out.print(eachElement + "\t");
            }

            System.out.println();

        }









    }

}
/*
1. CydeoStudents Task:
		1. given the following arrays:
		 		String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
		 		String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
		 		String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

		2. declare an array variable named batch1Groups with the length of three
				2.1 Assign batch1Group1, batch1Group2, batch1Group1 to each indexes
				 of the variable batch1Groups

		3. given the following arrays:
				String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
		 		String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
		 		String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

 		4. declare an array variable named batch24Groups with the length of
 				4.1 Assign batch2Group1, batch2Group2, batch2Group1 to each indexes of the variable batch2Groups

		5. declare an array variable named CydeoStudents and assign batch1Groups & batch2Groups to the indexes of CydeoStudents

		6. Print the names of each students



2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */