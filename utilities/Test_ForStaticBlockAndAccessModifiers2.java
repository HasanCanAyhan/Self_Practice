package utilities;

//import day27_accessModifiers.lessonQS.Data; // 1

//import static day27_accessModifiers.lessonQS.Data.d; //2


//import static day27_accessModifiers.lessonQS.Data.method3;//3

import static day27_accessModifiers.lessonQS.Data.*; // 4
// imports all the static members from Data Class


public class Test_ForStaticBlockAndAccessModifiers2 {

    public static void main(String[] args) {

        //System.out.println(Data.d); // 1

        System.out.println(d);//2

        method3();//3

        method4();//4 - you do not need to call ClassName



        /* Instance variable&methods - you can not call without creating objects
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        method1();
        method2();

         */





    }


}
