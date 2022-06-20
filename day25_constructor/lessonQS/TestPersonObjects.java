package day25_constructor.lessonQS;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Can",'M', LocalDate.of(1995,4,24),false,false);

        System.out.println(person1);


        System.out.println(person1.drink("Cola"));

        System.out.println(person1.eat("Hamburger"));

        person1.sleeping();

    }


}
