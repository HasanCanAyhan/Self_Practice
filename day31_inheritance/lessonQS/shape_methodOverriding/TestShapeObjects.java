package day31_inheritance.lessonQS.shape_methodOverriding;

public class TestShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(5);

        System.out.println(square);

        square.draw();

        System.out.println("-----------------------------------------");

        Circle circle = new Circle(3.5);

        System.out.println(circle);
        circle.draw();


        // triangle -  rectangle


        Rectangle rectangle = new Rectangle(2,2);
        System.out.println(rectangle);
        rectangle.draw();




    }

}
