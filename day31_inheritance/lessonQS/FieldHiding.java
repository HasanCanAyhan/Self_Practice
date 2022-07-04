package day31_inheritance.lessonQS;


class A{

    public int a = 100; // field hiding

}



public class FieldHiding extends A{

    public int a = 300;


    public static void main(String[] args) {

        System.out.println( new FieldHiding().a ); // 300

    }


}

