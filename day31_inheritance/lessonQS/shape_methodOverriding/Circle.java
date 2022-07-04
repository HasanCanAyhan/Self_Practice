package day31_inheritance.lessonQS.shape_methodOverriding;

public class Circle extends Shape{

    private double radius;


    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius * radius * 3.14;
    }

    @Override
    public double perimeter() {
        return 2 * radius * 3.14;
    }

    @Override
    public void draw() {
        super.draw();
        // code fragments that can draw a circle
        double distance;
        String result = "";
        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                distance = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));
                if(distance > radius - 0.5 && distance < radius + 0.5){
                    result += "*";
                } else {
                    result += " ";
                }
            }
            result += "\n";
        }
        System.out.println(result);
    }


    @Override
    public String toString() {
        return   getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", radius='" + getRadius() + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
