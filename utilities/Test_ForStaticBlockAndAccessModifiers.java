package utilities;


//IMPORT
import  day27_accessModifiers.lessonQS.Data; // imports everything of this class

import day27_accessModifiers.lessonQS.AccessModifiers;

public class Test_ForStaticBlockAndAccessModifiers {


    public static void main(String[] args) {


        System.out.println( Data.d);
        System.out.println( Data.e);
        System.out.println( Data.f);

        Data.method3();
        Data.method4();


        //Instance

        Data obj = new Data();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("--------------------------------------------");

        //DIFFERENT PACKAGE : package utilities;

        System.out.println(AccessModifiers.publicData); // public is always accessible in different packages

        //System.out.println(AccessModifiers.protectedData); // protected is NOT always accessible in different packages(sometime could be!)

        //System.out.println(AccessModifiers.defaultData);// default is NEVER be accessible in different packages

        //System.out.println(AccessModifiers.privateData); //private is NEVER be accessible in different packages

        new AccessModifiers();

        AccessModifiers.publicMethod();
        //AccessModifiers.protectedMethod();
        //AccessModifiers.defaultMethod();
        //AccessModifiers.privateMethod();



    }



}
