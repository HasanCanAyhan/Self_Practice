package day33_abstraction.lessonQS;

public class Abstraction {

    /*

    OOP Abstractrion:
		1. abstract method
		2. abstract class
		3. interface
		4. extends vs implements

    Abstraction:
        -process of hiding implementation details from the user
        -only the functionality will be provided to the user
        -focusing on the essential qualities of something rather than one specific example.
        (ignoring the irrevelant & unimportant)
        -user will have the information on what the object does instead of how it does



     Abstract Method: ( Method without the body (implementation) )

        • A method that does not have body, only signature

        • A method that’s meant to be overridden

        • Abstract keyword is used to create abstract method


      Abstract Method Rules:  - like method overriding

        • An abstract method can not be static

        • An abstract method can not be final

        • An abstract method can not have private access modifier

        • An abstract method does not have body

        • An abstract method can only be created in an abstract class or in an interface

      Abstract Class:

        - Super (parent) class is responsible to provide
        the variables and methods that are needed to
        the all the sub classes without worrying about
        the small details

        - Sub (child) classes are responsible for providing the implementations that are needed

        • A class that’s meant to be a parent (super) class

        • Goal is to provide reusable variables and methods to sub classes

        • Abstract keyword is used to create the abstract class

        • An abstract class can not be instantiated



       -Creating Object

            • Abstract class is meant to be inherited only,
            not meant to be instantiated

            • Abstract class is not a concrete class and
            object has to be concrete

            • A sub class of abstract class is called
            concrete class, and it can be instantiated

            • A Concrete class must implement all the
            inherited abstract methods




          Regular class

            can have constructors, instances and statics
            Regular class can be instantiated
            Regular class can not have abstract method
            Regular class can be declared as final

          Abstract class

            can have constructors, instances and statics
            Abstract class can not be instantiated
            Abstract class can have abstract method
            Abstract class can not be declared as final

     */


}
