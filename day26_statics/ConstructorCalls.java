package day26_statics;

public class ConstructorCalls {
    /*

this: refers to the instances

	this. : to call instance variables & instance methods
	this(): used for calling constructors in another constructor


Constructor Calls:
		1. Constructors can not be called by its name ( this() need to be used)
		2. Only a constructor can call another constructor
		3. Constructor call MUST be at the first step
		4. One constructir can not call more than one constructor
		5. Constructor can not call or contain itself
     */


    public ConstructorCalls(){

        //this(9);
        System.out.println("Default constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
        //this(); Constructor call MUST be at the first step
    }


    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String c){

        this(2.5);
        //this();
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        method1();

        System.out.println("----------------------------------------------");

        method2();

    }


    public static void method1(){
        //ConstructorCalls()
        //this();
        System.out.println("Method1");
    }

    public static void method2(){
        method1();//method name
        System.out.println("Method2");
    }


}
