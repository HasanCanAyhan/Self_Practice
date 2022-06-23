package day27_accessModifiers.lessonQS;

public class TestNestedClassObjects {

    public static void main(String[] args) {

        // Inner class instance

        Car obj1 = new Car(); // Car object - it should be done first,then...
        //  obj1 : outer class object

        Car.CarEngine obj2 =  obj1.new CarEngine(); // CarEngine object
        // obj2 : inner class object

        System.out.println("------------------------------");

        // Inner class static


        Car.StaticInnerClass obj3 =  new Car.StaticInnerClass();  // you can call without creating objects



    }

}
