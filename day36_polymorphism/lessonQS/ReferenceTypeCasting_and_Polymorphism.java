package day36_polymorphism.lessonQS;

public class ReferenceTypeCasting_and_Polymorphism {

    /*
    castings: converting one type to another

2 types of type castings:

		1. Primitive Type Castings: must happen between primitives

				1. implicit primitive type casting: casting smaller primitive type to larger primitive type  (done implicitly)

								int a = 100;
								double b = a; // implcitly casted to double

				2. explicit primitive type casting: casting larger primitive type to smaller primitive type

								long a = 100;
								short b = (short)a;



		2. Reference Type Castings: THERE MUST BE INHERITANCE

			  1. Upcasting: casting the sub type to super type (done implicitly)

			  			Car car	= new BMW();

			  2. Downcasting: casting the super type to sub type (done explicitly)




OOP Polymorphsim: parent type being referenced to the child object
				 ability of the objects to take on many forms

				 "IS A" relation is a must

				 Reference type can be either parent class or parent interface, and object must be created from child class

				 Reference Type decides what can be accessed/called
				 		(if we need to access the features that are in object type, but not in the reference type, then we need down casting)

		 		 Object type decidesw hich implementation will be executed





Runtime polymorphism (dynamic polymorphism): method overriding
										one method with multiple implementations (revealed during the run time)


										eat():

										implementation1: Baklava
										implementation2: Java
										...



compile time polymorphism (static polymorphism) : method overloading
						   multiple methods with the same name
						   each method has one implementation ONLY ( revealed during the compile time)


						   add(num1, num2)
						   add(num1, num2, num3)






     */
}
