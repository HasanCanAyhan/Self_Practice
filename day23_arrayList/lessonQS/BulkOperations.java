package day23_arrayList.lessonQS;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {


        // BULK OPERATIONS**** COLLECTION TYPE

        /*
        containsAll - addAll - removeAll - retainAll() : It has to be COLLECTION TYPE
         */

        // addAll(CollectionType) : adds all the given collection of values to the ArrayList


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1); // index : 0
        list1.add(2); // index : 1
        list1.add(3);// index : 2

        // list1.addAll(numbers);
        // we can not write list1.addAll(10,20,30,40) , because it is not CollectionType.

        //System.out.println(list1); // [1, 2, 3, 10, 20, 30, 40]


        list1.addAll(1, numbers);
        System.out.println(list1); // [1, 10, 20, 30, 40, 2, 3]

        System.out.println("-----------------------------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();

        //Arrays Utility:
        //*** asList() : returns a List, that contains the specified elements/array, List is CollectionType.
        //if you want to add multiple elements into arrayList at once , you can use asList method

        scores.addAll(  Arrays.asList( 75,85,95,70 ,80  )  ); // we added these elements into Arraylist at once.

        System.out.println(scores); // [75, 85, 95, 70, 80]

        System.out.println("-----------------------------------------------------------");

        ArrayList<String> students = new ArrayList<>();

        // 1. asList : one of task of asList method

        students.addAll( Arrays.asList( "Gadir", "Hasan", "Abidullah", "Bilal"   )         );
        // we added multiple elements into Arraylist at once.

        System.out.println(students); // [Gadir, Hasan, Abidullah, Bilal]

        students.addAll(2,  Arrays.asList(  "Shukur", "Sumeye", "Tatiana"  )    );

        System.out.println(students);
        //[Gadir, Hasan, Shukur, Sumeye, Tatiana, Abidullah, Bilal]


        System.out.println("-----------------------------------------------------------");


        // 2. asList : another task of asList method

        // Collection doesnt accept primitive type

        // ARRAY ---->>> ARRAYLIST with asList method

        Integer[] nums = {1,2,3,4,5,6,7,8};
        // if array is  primitive type like int[] nums ...., then you can not convert it into Arraylist with asList method

        ArrayList<Integer> l1 = new ArrayList<>(); // Arrylist type can not be primitive type even if its dataType Integer or int

        // l1.addAll(nums); // error because nums is Array and Array is not Collection type
        l1.addAll(  Arrays.asList(nums)  ); // 1.Way

        System.out.println(l1); // [1, 2, 3, 4, 5, 6, 7, 8]


        // ArrayList<Integer> l1 = new ArrayList<>(    Arrays.asList(nums)   ); 2.Way


        System.out.println("-----------------------------------------------------------");




        // containsAll(CollectionType) : checks if the ArrayList contains all the given collection of values, return type is boolean

        ArrayList<String> employeesList = new ArrayList<>();

        employeesList.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali"));

        System.out.println(employeesList); // [Alena, Muhtar, Gadir, Ali]

        boolean hasAlena = employeesList.contains("Alena");

        boolean hasAlenaGadir = employeesList.containsAll(Arrays.asList("Alena", "Gadir"));

        boolean hasMuhtarAliKuzzat = employeesList.containsAll(Arrays.asList("Muhtar", "Ali", " Kuzzat"));

        System.out.println("hasAlena = " + hasAlena); // true
        System.out.println("hasAlenaGadir = " + hasAlenaGadir); // true
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat); // false : one of them does not exist



        System.out.println("----------------------------------------------------");


        // removeAll(CollectionType) : removes all the matching values from the ArrayList

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 10, 20, 20, 20, 20));

        list.removeAll( Arrays.asList(10,20));

        System.out.println(list); // [30, 40, 50, 60, 70]

        System.out.println("-----------------------------------------------------------------------");



        // retainAll(CollectionType) : removes all the un-matching values from the Arraylist.(keeps the matching values only)


        ArrayList<String> developers = new ArrayList<>();

        developers.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali", "Khashayar", "Madiyar", "Muhtar", "Muhtar", "Alena"));

        developers.retainAll(Arrays.asList("Alena", "Khashayar", "Muhtar"));

        System.out.println(developers);
        // [Alena, Muhtar, Khashayar, Muhtar, Muhtar, Alena]


        System.out.println("----------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.addAll(
                Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towels")
        );

        //groceriesList.removeAll( Arrays.asList("Rice","Orange","Strawberry","Blueberry","Paper towels" )  );
        groceriesList.retainAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato")); // Those will be retain.

        System.out.println(groceriesList);
        // [Eggs, Potato, Milk, Tomato]

















    }

}
