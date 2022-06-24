package day27_accessModifiers.practiceTasks;

public class TestPersonObjects { // Task 4

    public static void main(String[] args) {

        Person person1 = new Person("Can",27,'M',"Turkish");

        System.out.println(person1);

        person1.eat("Hamburger");

        person1.drink("Cola");

        Person.printPlanetName();

        System.out.println( Person.hasNose );
        System.out.println( Person.numberOfHead );
        System.out.println( Person.numberOfWings );


    }


}
