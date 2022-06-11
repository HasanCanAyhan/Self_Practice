package day22_arrayList.lessonQS;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        // instance method called through object
        // static method called through class name

        // add()

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);// index num : 0
        list.add(20);// index num : 1
        list.add(30);// index num : 2
        list.add(10);// index num : 3

        //list.add(5.5);

        System.out.println(list);  // [10, 20, 30, 10]

        list.add(1,15); // index: 1

        System.out.println(list); // [10, 15, 20, 30, 10]

        list.add(2,25);

        System.out.println(list); // [10, 15, 25, 20, 30, 10]

        System.out.println("---------------------------------------");

        // get() : return element

        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("Mohammed");// index : 0
        studentsList.add("Abdurasul");// index : 1
        studentsList.add("Abidullah");// index : 2
        studentsList.add("Tatiana");// index : 3

        System.out.println(studentsList.size()); // 4

        System.out.println(studentsList); // [Mohammed, Abdurasul, Abidullah, Tatiana]

        String firstStudent = studentsList.get(0);
        System.out.println(firstStudent); // Mohammed

        String lastStudent = studentsList.get(  studentsList.size() -1   );
        System.out.println(lastStudent); // Tatiana


    }

}
