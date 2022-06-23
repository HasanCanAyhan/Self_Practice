package day27_accessModifiers.lessonQS;

public class InstanceInitializationBlock {


    public String name;
    public int age;

    /*
    { //Instance block :  you can not pass the argument! Those are default variable.
        name = "James";
        age = 20;
    }

     */

    public InstanceInitializationBlock(String name, int age) { // Constructor
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        /*
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock();
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock();

        System.out.println(obj1.name); // James
        System.out.println(obj2.name); // James

         */

        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("James",25);
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Aaron",28);

        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }


}
