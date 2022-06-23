package day27_accessModifiers.lessonQS;

public class InstanceBlock {

    { // Instance block // First executed

        System.out.println("Instance block");
    }


    public InstanceBlock(){ // second executed
        System.out.println("Constructor");
    }


    public static void main(String[] args) {

        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();

    }

}
