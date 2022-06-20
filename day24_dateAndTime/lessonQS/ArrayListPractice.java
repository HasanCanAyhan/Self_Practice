package day24_dateAndTime.lessonQS;

import day17_customClass.lessonQS.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {


        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee() ));
        //           0               1                 2              3                  4


        // first object .setInfo
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");

        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");

        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");

        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");

        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");


        //   1.1 Write a program that can display the name and job title of each employee

        for (Employee eachEmployeeObject : employees) {

            System.out.println(eachEmployeeObject.name + " " + eachEmployeeObject.jobTitle );

        }

        System.out.println("------------------------------------------------");

        //  1.2 Write a program that can display the names of "Java Developers"

        for (Employee eachEmployeeObject : employees) {

            if (eachEmployeeObject.jobTitle.equals("Java Developer")){
                System.out.println(eachEmployeeObject.name);
            }

        }

        System.out.println("------------------------------------------------");

        // 1.3 Write a progam that can display the maximum and minimum salary

        // you can not Collection.max() or min()

        double max = employees.get(0).salary;
        double min = employees.get(0).salary;

        for (Employee each : employees) {

            if(each.salary > max){
                max = each.salary;
            }

            if(each.salary < min){
                min = each.salary;
            }

        }

        System.out.println("min = " + min); //  90000.0
        System.out.println("max = " + max); // 130000.0

        System.out.println("------------------------------------------------");

        // 1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that
        // can add all the female employees and male emloyees to the femaleEmployees and maleEmployees arraylists

        ArrayList<Employee> maleEmployees = new ArrayList<>();
        ArrayList<Employee> femaleEmployees = new ArrayList<>();

        for (Employee each : employees) {

            if(each.gender == 'M'){
                maleEmployees.add(each);
            }else{
                femaleEmployees.add(each);
            }

        }

        System.out.println(maleEmployees.size());
        System.out.println(femaleEmployees.size());



    }

}
/*
Warmup tasks:
	1. Given the following arraylist of Employees:
			ArrayList<Employee> employees = new ArrayList<>();
	        employees.addAll(Arrays.asList(
	               new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
	        ));

	        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
	        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
	        employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
	        employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
	        employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

	        Note: Employee class is imported from day17 package

	        1.1 Write a program that can display the name and job title of each employee

	        1.2 Write a program that can display the names of "Java Developers"

	        1.3 Write a progam that can display the maximum and minimum salary

	        1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that
	         can add all the female employees and male emloyees to the femaleEmployees and maleEmployees arraylists
 */
