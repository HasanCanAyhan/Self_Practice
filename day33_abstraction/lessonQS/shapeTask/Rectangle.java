package day33_abstraction.lessonQS.shapeTask;

public class Rectangle extends Shape{


    private double width,length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2*(width + length);
    }

    @Override
    public void draw() {
        System.out.println(getName() + " is drawn by the students");
    }

    @Override
    public String toString() {
        return  getName()+"{" +
                "width=" + width +
                ", length=" + length +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
