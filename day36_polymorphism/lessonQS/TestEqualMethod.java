package day36_polymorphism.lessonQS;

public class TestEqualMethod {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        Circle circle2 = new Circle(5);

        Circle circle3 = new Circle(15);

        // 2 different objects


        System.out.println(circle1 == circle2); // false different object

        //System.out.println(circle1.equals("Java")); // Invalid Object , object must be Circle

        System.out.println(circle1.equals(circle2)); // true
        // Normally equals method come from Object Class, but we overrided the method inside Circle - Custom Class
        // and we can use this overridden version of equals method like toString() - Method


        System.out.println(circle1.equals(circle3)); // false

        System.out.println("-------------------------------------------------------------------");


        IPhone iPhone1 = new IPhone("Apple","Iphone 12","Medium","Black",900);
        IPhone iPhone2 = new IPhone("Apple","Iphone 12","Medium","White",900);


        //System.out.println(iPhone1.equals(circle1)); // Invalid object, Object must be Iphone

        System.out.println(iPhone1.equals(iPhone2));






    }

}
