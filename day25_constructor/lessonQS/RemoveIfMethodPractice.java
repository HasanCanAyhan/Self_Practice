package day25_constructor.lessonQS;

import day17_customClass.lessonQS.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodPractice {

    public static void main(String[] args) {

        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");


        // 1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

        // Note: DO NOT use any loops

        ArrayList<Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs));

           /*
        for (Dog dog : dogs) {

            if (dog.size.equalsIgnoreCase("Small")){
                smallDogs.add(dog);
            }

        }

         */


        smallDogs.removeIf(each -> !each.size.equals("Small") );

        System.out.println(smallDogs);

        System.out.println("-------------------------------------------------------");


        //2. Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

        ArrayList<Dog> youngDogs = new ArrayList<>(Arrays.asList(dogs));

        youngDogs.removeIf(each -> each.age > 4);

        System.out.println(youngDogs);

        youngDogs.forEach(p -> System.out.println(p.name)); // new

        System.out.println("----------------------------------");

        //3.Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList
        //4.Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to femaleDogs arrayList


        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(p -> p.gender == 'M');

        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));
        maleDogs.removeIf(p -> p.gender == 'F');


        System.out.println("-----------------------------------------------------");

        // A little bit more challenging

        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs2[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs2[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs2[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");


        System.out.println(Arrays.toString(dogs2));

        // 1. convert ArrayList (Array --->>> ArrayList)

        ArrayList<Dog> list = new ArrayList<>( Arrays.asList(dogs2));

        // 2. removeIf method--->>>> we want to remove small
        list.removeIf(p -> p.size.equalsIgnoreCase("small"));

        // 3 . Arraylist --->>> Array

        dogs2 = list.toArray(new Dog[0]);  // or :  dogs2 = list.toArray( new Dog[list.size()])

        System.out.println(Arrays.toString(dogs2));




    }

}
/*
1. Give the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from day17 package

        1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

            Note: DO NOT use any loops

    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

            Note: DO NOT use any loops

    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

            Note: DO NOT use any loops

    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

            Note: DO NOT use any loops
 */