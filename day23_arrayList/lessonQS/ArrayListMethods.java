package day23_arrayList.lessonQS;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {


        // set(index, newElement) : replaces the element of the arrayList at the given index to the new element

        // in order to update the element

        int[] array = {1, 2, 3, 4, 5};

        array[0] = 100; // updated with 100.

        System.out.println(Arrays.toString(array));

        System.out.println("---------------------------------------");


        ArrayList<String> groceriesList = new ArrayList<>(); // mutable you can change it

        groceriesList.add("Eggs");
        groceriesList.add("paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList); // [Eggs, paper Towels, Apples, Cooking oil]

        // groceriesList[2] = "Oranges"; you can not write so like this, because it is not Array, it is ArrayList

        groceriesList.set(2, "Oranges");
        System.out.println(groceriesList); // [Eggs, paper Towels, Oranges, Cooking oil]


        // add_vs_set

        // add() increases the size of Arraylist
        // set() will be the same size.

        groceriesList.add(2, "Chicken");
        System.out.println(groceriesList); // [Eggs, paper Towels, Chicken, Oranges, Cooking oil]

        System.out.println("----------------------------------------------------------------");

        // remove(int index) : removes the element at the given index from the ArrayList, size will be decreased
        // remove(Object) : removes the given object from the ArrayList(first matching), and returns boolean
        // remove() : 2 option ,  1. index num , 2. object name

        groceriesList.remove(0);
        System.out.println(groceriesList); // [paper Towels, Chicken, Oranges, Cooking oil]

        groceriesList.remove("paper Towels");
        System.out.println(groceriesList); // [Chicken, Oranges, Cooking oil]


        System.out.println("----------------------------------------------------------------");

        // remove method ex : Integer

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); // 3
        numbers.add(50); // 4

        numbers.remove(0);

        // if you want to remove with ObjectName, you must convert primitive type Wrapper class object
        numbers.remove(Integer.valueOf(20));
        // **** valueOf() methods --->> converts primitive(int) to Wrapper Class Object (Integer)
        System.out.println(numbers); // [30, 40, 50]


        System.out.println("----------------------------------------------------------------");

        // clear(): removes all the objects from ArrayList, size will be set to zero

        numbers.clear();
        System.out.println(numbers);//[]
        System.out.println(numbers.size()); // 0

        System.out.println("----------------------------------------------------------------");

        // indexOf(element) : returns the index number of the first matching element from the ArrayList, return type is int
        // lastIndexOf(element) : returns the index number of the last matching element from the ArrayList, return type is int

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");


        System.out.println(names.indexOf("Vasyl")); // 0
        System.out.println(names.lastIndexOf("Vasyl")); // 1

        System.out.println(names.indexOf("Sumeye"));//2
        System.out.println(names.lastIndexOf("Sumeye")); // 5

        System.out.println("----------------------------------------------------------------");

        // contains(element) : checks if Arraylist contains the given element, return type is boolean

        boolean hasMuhtar = names.contains("Muhtar");
        System.out.println("hasMuhtar = " + hasMuhtar); // false

        boolean hasAli = names.contains("Ali");
        System.out.println("hasAli = " + hasAli); // true


        System.out.println("----------------------------------------------------------------");


        // equals(list) : checks if the ArrayList is equal to the given list, return type is boolean


        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 =  list1;

        list1.add(10);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println( list1 == list2);// true - same object

        ArrayList<Integer> l1 = new ArrayList<>();

        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println( l1 == l2); // false  different objects

        System.out.println(l1.equals(l2)); // true it checks element, order must be same!!

        System.out.println("--------------------------------------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();

        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();

        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2));// false-- because different order, it is not same order


        System.out.println("-----------------------------------------------------------------------");

        // isEmpty() : checks if the ArrayList is empty(size is 0), return type is boolean

        System.out.println(n1.isEmpty()); // f
        System.out.println(n2.isEmpty()); // f

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty()); // t
        System.out.println(n2.isEmpty()); // t



    }

}
