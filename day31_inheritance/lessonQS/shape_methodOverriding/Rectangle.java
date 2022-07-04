package day31_inheritance.lessonQS.shape_methodOverriding;

public class Rectangle extends Shape{

    private double width, length;

    public Rectangle(double width, double length) {
        setLength(length);
        setWidth(width);
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
        return 2 * (width + length);
    }

    @Override
    public void draw() {
        super.draw();

        System.out.println("*  *  *  *  *  *  *");
        for (int i = 0; i <7 ; i++) {
            System.out.println("*                 *");
        }
        System.out.println("*  *  *  *  *  *  *");;
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                "  width=" + width +
                ", length=" + length +
                '}';
    }
}
