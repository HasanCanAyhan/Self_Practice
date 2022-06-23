package day27_accessModifiers.lessonQS;

public class AccessModifiers {

    // Public  >  protected  >  default  >  private

    public static int publicData = 200;

    protected static int protectedData = 300;

    static int defaultData = 400; // default modifier - we don´t have any keyword .

    private static int privatedData = 500;


    public AccessModifiers(){

    }


    public static void publicMethod(){
        System.out.println("Public");
    }

    protected static void protectedMethod(){
        System.out.println("protected");
    }

    static void defaultMethod(){
        System.out.println("default");
    }

    private static void privateMethod(){
        System.out.println("private");
    }


    public static void main(String[] args) {

        System.out.println(publicData); //  public is accessible within same class

        System.out.println(protectedData); // protected is accessible within same class

        System.out.println(defaultData); // default is accessible within same class

        System.out.println(privatedData); // private is accessible within same class

        new AccessModifiers();

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();


    }



}
