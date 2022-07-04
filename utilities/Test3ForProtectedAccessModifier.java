package utilities;

import day31_inheritance.lessonQS.ProtectedAccessModifier;

public class Test3ForProtectedAccessModifier extends ProtectedAccessModifier{

    // different package

    // if it is SUBCLASS, then the protected access modifier is visible

    public static void main(String[] args) {
        System.out.println(ProtectedAccessModifier.a);
        ProtectedAccessModifier.method1();
    }



}
