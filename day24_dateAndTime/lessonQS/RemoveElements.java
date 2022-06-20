package day24_dateAndTime.lessonQS;

import day17_customClass.lessonQS.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveElements {

    public static void main(String[] args) {


        // RemoveIf Method

        ArrayList<Integer> list = new ArrayList<>(); // 0 ~ 9
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        System.out.println(list);

        // remove less than 4

        list.removeIf(each -> each < 4); // each represents each element of the list

        System.out.println(list); // [4, 5, 6, 7, 4, 5, 6, 7]

        System.out.println("--------------------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python","C#","Java","Ruby","JavaScript","C++", "C"));


        // remove if it starts with J

        names.removeIf(p -> p.startsWith("J"));

        System.out.println(names); // [Python, C#, Ruby, C++, C]

        System.out.println("--------------------------------------------------------------------");

        ArrayList<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee() ));

        // first object .setInfo
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");

        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");

        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");

        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");

        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");


        // remove if salaray greater than 100000

        employees.removeIf(each -> each.salary > 100000);

        for (Employee each : employees) {

            System.out.println(each.name + " " + each.salary); // Josh 100000.0 ,Emily 90000.0 , Bella 95000.0
        }


    }


}
/*
/*

    2. Write a program that can remove tehe elemnts that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]
 */
