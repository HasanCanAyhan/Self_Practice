package day27_accessModifiers.lessonQS;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor(){  // it depends on obj // 4. executed
        System.out.println("Constructor");
    }

    { // it depends on obj  // 3. executed
        System.out.println("Instance Block");
    }

    static {  // it DOES NOT depend on obj // 1. executed // it is only executed once.
        System.out.println("Static Block");
    }


    public static void main(String[] args) {


        System.out.println("Main Method"); // 2. executed

       new StaticBlock_vs_InstanceBlock_vs_Constructor();
       new StaticBlock_vs_InstanceBlock_vs_Constructor();



    }

}
