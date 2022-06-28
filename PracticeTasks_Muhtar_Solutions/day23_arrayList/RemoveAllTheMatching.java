package PracticeTasks_Muhtar_Solutions.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllTheMatching {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));

        list.removeIf(p -> p.equals("Ahmed"));

        //list.removeAll(Arrays.asList("Ahmed"));

        System.out.println(list);



    }

}
/*
Write a program that can remove all the names "Ahmed" from an arraylist of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];
            output:
            	["John", "Daniel", "James", "Muhammed"];
 */