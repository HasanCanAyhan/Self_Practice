package day24_dateAndTime.lessonQS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {


        // frequency(list, element) : returns the frequency of the element from the list
        // replaceAll() : all occurences of a specified element in a list with a new list


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java" , "Java" , "C#", "C#","Ruby","Swift","Swift","Java"));

        System.out.println(names);

        // 1.Way
         /*
        for (int i = 0; i < names.size(); i++) {

            if(names.get(i).equals("Java")){  // if you want to , you can use -> names.get(i).equalsIgnoreCase
                names.set(i,"Python");
            }

        }

         */

        Collections.replaceAll(names,"Java", "Python");
        //                      list,     old value ,   new value
        System.out.println(names);
        // [Python, Python, Python, C#, C#, Ruby, Swift, Swift, Python]


        System.out.println("-----------------------------------------------------");

        // frequency(list, element) : returns the frequency of the element from the list

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,20,20,30,40,40,50,50,50,50,60,60,50,50,50,50));


        int count = Collections.frequency(list,50);
        System.out.println(count); // 8

        System.out.println("-------------------------------------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java" , "Java" , "C#", "C#","Ruby","Swift","Swift","Java"));


        int countJava = Collections.frequency(words,"Java");

        System.out.println(countJava); // 4

        System.out.println("---------------------------------------------------------------");

        // Unique

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20,20,30,40,40,50,50,50,50,60,60,50,50,50,50));

        for (Integer each : numbers) {

            if (Collections.frequency(numbers,each) == 1){
                System.out.println(each); // 10 , 30
            }

        }







    }

}
