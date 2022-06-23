package day27_accessModifiers.lessonQS;

public class Car { // Outer class - and outer class can not be static

    /* Static Class

    Classes can be nested, nested classes allows us to group classes that belong together to make code more readable and maintainable

    Inner class can be static, and it allows us to access its members without creating objects


     */

    public String make, model,color;
    public int year;
    public double price;

    public static int wheels = 4;

    public class CarEngine{ // Inner class - not static - // Instance of the Car object

        public  void method(){
            System.out.println(make);
            System.out.println(wheels);
        }


    }


    public static class StaticInnerClass{ // Inner class - static

        // it only accepts static members - static only accepts static

        public void method(){
            //System.out.println(make);

            System.out.println(wheels);
        }


    }





}
