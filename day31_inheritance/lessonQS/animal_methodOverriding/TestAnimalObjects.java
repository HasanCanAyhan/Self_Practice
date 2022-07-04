package day31_inheritance.lessonQS.animal_methodOverriding;

public class TestAnimalObjects {

    public static void main(String[] args) {

        Cat cat = new Cat("Emily","Bangle",'F',4, "Small","Gray");

        Dog dog = new Dog("Max","Husky",'M',3,"Large","White");

        Lion lion = new Lion("Simba","African Lion",'M',6,"Large","Yellow",true);

        Eagle eagle = new Eagle("Bella","African Eagle",'F',4,"Medium","Black & White");


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("-----------------------------------------------");

        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();

        System.out.println("----------------------------------------------");

        cat.sleep(); // that is overriden

        dog.sleep();
        eagle.sleep(); // three of them call the eat method  from Animal class,because we didn´t override
        lion.sleep();




    }

}
