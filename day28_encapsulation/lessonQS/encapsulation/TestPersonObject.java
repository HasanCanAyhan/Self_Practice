package day28_encapsulation.lessonQS.encapsulation;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("Can",0,'M', LocalDate.of(1996,8,26));

        System.out.println(person1);


    }

}
