package day26_statics.lessonQS;

public class TestIphoneObjects {

    public static void main(String[] args) {


        Iphone iPhone = new Iphone("iphone 12","Black",1000);

        //instance variable called through object
        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        // instance methods  called through object
        iPhone.printIphoneInfo();

        /* Object can access to static variable, but not preferred!
        System.out.println(  iPhone.brand );
        System.out.println(  iPhone.OS );
        iPhone.printOperatingSystem();
         */

        // static variable/ methods called through ClassName
        System.out.println(  Iphone.brand   );
        System.out.println(  Iphone.OS   );
        Iphone.printOperatingSystem();

    }

}
