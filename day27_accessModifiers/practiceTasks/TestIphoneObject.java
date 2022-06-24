package day27_accessModifiers.practiceTasks;

public class TestIphoneObject { // Task1

    public static void main(String[] args) {

        Iphone obj1 = new Iphone("X","Black",12.5,1500,"USA");

        obj1.call(1234556679);
        obj1.text(1234556679);
        obj1.faceTime(1234566);
        obj1.faceTime("iphone@gmail.com");


        Iphone.printOperatingSystem();



    }

}
