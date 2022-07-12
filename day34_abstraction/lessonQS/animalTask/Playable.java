package day34_abstraction.lessonQS.animalTask;

public interface Playable {


    boolean isFriendly = true; // static & final , public is given by default-automatically
    // normally like this : public static final boolean isFriendly

    /* static method
    private static void main(String[] args) {

        System.out.println(isFriendly);

        //isFriendly = false; error : it is final variable - unchangeable

    }


    // default method for instance method

    default void method1(){          access modifier is public by default

    }
     */

    void play(); // abstract method
    // normally like this:  public abstract void play();



}
