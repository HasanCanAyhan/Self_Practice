package day37_exceptions;


import day36_polymorphism.lessonQS.Circle;

public class TestPizzaObject {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S',2,3);

        Pizza pizza2 = new Pizza('S',2,3);

        System.out.println(pizza1 == pizza2); // false different object

        System.out.println(pizza1.equals(pizza2)); // true

        Object obj = new Pizza('S',4,3);// upcasting

        boolean r = obj.equals(pizza2);
        System.out.println(r);

        double total = ((Pizza)obj).calcCost(); // there is no inside the Object Class "calcCost()", it is inside the PizzaClass
        System.out.println(total);

        //double area = ((Circle)obj).area(); // error : ClassCastException, there is no "IS - A" Relation between Circle and Pizza
        //System.out.println(area);

        System.out.println("Test Completed");

    }

}
