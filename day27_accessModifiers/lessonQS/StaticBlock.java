package day27_accessModifiers.lessonQS;

public class StaticBlock {

    public StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) { // Second executed
        System.out.println("Main Method");

        new StaticBlock();
        new StaticBlock(); // 3 objects
        new StaticBlock();

    }

    static { // First executed
        System.out.println("Static Block"); // it is run only one time
    }


}
