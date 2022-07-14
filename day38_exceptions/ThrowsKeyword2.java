package day38_exceptions;

import utilities.Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {

    public static void main(String[] args)  {

        // disadvantage :

        // for just using checked exception
        // It is not a permanent solution, it is temporary


        //method1();

        Library.sleep(3.5);

        //method2();



    }



    public static void pauseFor5Seconds() throws InterruptedException { // temporary

        Thread.sleep(5000);
        //Temporarily implies that throws handles just for the actual method not for recalling it.

    }

    public static void method1() throws InterruptedException {
        System.out.println("Hello World");
        pauseFor5Seconds(); // we take error, if we dont use throws InterruptedException
        System.out.println("Hello Cydeo");
    }

    public static void method2() throws InterruptedException, FileNotFoundException { // parent class should be at the End, but it is still temporary
        System.out.println("First program started");

        Thread.sleep(3000);

        System.out.println("First program ended");

        new FileInputStream(" ");
        Thread.sleep(5000);

    }



}
