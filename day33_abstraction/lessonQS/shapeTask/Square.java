package day33_abstraction.lessonQS.shapeTask;

public class Square extends Shape{

    private double side ;


    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public void draw() {
        System.out.println(getName()+ " is drawn by the students");
    }

    @Override
    public String toString() {
        return   getName()+"{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
