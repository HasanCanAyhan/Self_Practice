package day27_accessModifiers.lessonQS;

public class Test_ForStaticBlockAndAccessModifiers {

    public static void main(String[] args) {


        // if we are within the same package , you don´t need to import statement


        //new StaticInitializationBlock();

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("--------------------------------------------------");

        // SAME PACKAGE : package day27_accessModifiers.lessonQS;

        System.out.println(AccessModifiers.publicData); // public is accessible within same package

        System.out.println(AccessModifiers.protectedData); // protected is accessible within same package

        System.out.println(AccessModifiers.defaultData); // default is  accessible within same package

        //System.out.println(AccessModifiers.privateData); // private is not accessible within same package

        new AccessModifiers();

        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
        //AccessModifiers.privateMethod();

    }


}
