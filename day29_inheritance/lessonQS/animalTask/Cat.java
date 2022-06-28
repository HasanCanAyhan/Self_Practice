package day29_inheritance.lessonQS.animalTask;

public class Cat extends Animal{ // Cat is an Animal

    public void meow(){
        System.out.println(getName() + " is meowing");
    }

    public void scratch(){
        System.out.println(getName() + " is scratching");
    }


}
/*
	2. Cat
			attributes:


			methods:
				meow(), scratch()
 */