package day33_abstraction.lessonQS.shapeTask;

public class TestShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(2);

        Square square = new Square(2);

        Rectangle rectangle = new Rectangle(2,3);


        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);

        System.out.println("------------------------------");

        circle.draw();
        square.draw();
        rectangle.draw();


    }
}
