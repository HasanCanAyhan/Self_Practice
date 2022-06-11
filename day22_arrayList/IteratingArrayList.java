package day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100); // index: 0
        numbers.add(200); // index: 1
        numbers.add(300); // index: 2
        numbers.add(400); // index: 4
        numbers.add(500); // index: 5
        numbers.add(3,255); // index: 3

        System.out.println(numbers); // [100, 200, 300, 255, 400, 500]

        System.out.println("-----------------------------------------------");

        // for loop

        for (int i = 0; i < numbers.size(); i++){
            int each = numbers.get(i);// for element
            System.out.println(each);
        }

        /*
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println( numbers.get(i)   );
        }


         */

        System.out.println("-----------------------------");

        // reverse

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i)); // 500~100
        }

        System.out.println("-----------------------------");

        // for each loop

        // we can write also int each : numbers --->> unboxing(Integer --->> int)
        for (Integer each : numbers) {
            System.out.println(each); // 100~500
        }


    }

}
