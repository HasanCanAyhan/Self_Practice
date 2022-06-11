package day22_arrayList;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        /*

        Data Structure :
            Array(size is fixed), (supports both primitives & non-primitives, can be multi dimensional)
            Collection : size is dynamic, ONLY supports non-primitives
            Map : size is dynamic,  ONLY supports non-primitives

         */

        // dedicated classes of 8 Primitives

        // presented in " java.lang "

        // provide the mechanism to convert primitive into object and object into primitive

        /*
        Primitive            Wrapper Classes

        byte                   Byte
        short                  Short
        int                    Integer *
        long                   Long
        float                  Float
        double                 Double
        char                   Character *
        boolean                Boolean

         */

        // Primitive ---->>>> Wrapper Class(Object Type) : Auto Boxing
        // Wrapper Class(Object Type)----->> Primitive  : Unboxing

        //-------------------------------------------------------------

        int a = 10; // primitive

        Integer a2 = 10; // Wrapper class


        System.out.println("----------------------------------------");

        int b1 = 100;

        Integer b2 = b1; // Auto Boxing

        // Long b3 = b1;   you can not assign!!!
        // Double b4 = b1; you can not assign!!!


        char ch = 'A';
        Character ch2 = ch; // auto boxing

        double d1 = 5.5;
        Double d2 = d1; // auto boxing


        //-------------------------------

        Integer n1 = 2;
        int n2 = n1; // unboxing
        //   long n3 = n1;
        //   double n4 = n1;


        Character e1 = 'Z';
        char e2 = e1; // unboxing
        //int e3 = e1;



    }


}
