package day38_exceptions.lessonQS;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person1 =  new Person("Daniel",32,'M');

        System.out.println(person1);

        //person1.setAge(-25);

        /*
        try {
            person1.setAge(-25);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

         */


        System.out.println(person1);

    }


}
