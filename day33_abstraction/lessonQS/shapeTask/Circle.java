package day33_abstraction.lessonQS.shapeTask;

public class Circle extends Shape{


    private double radius;
    public final static double pi;

    public Circle(double radius) {
        setRadius(radius);
    }

    static{
        pi = 3.14;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }

    @Override
    public void draw() {
        System.out.println(getName() + " is drawn by the students");
    }

    @Override
    public String toString() {
        return   getName() + "{" +
                "radius=" + radius +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
