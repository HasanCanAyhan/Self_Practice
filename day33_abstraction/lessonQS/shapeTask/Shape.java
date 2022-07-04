package day33_abstraction.lessonQS.shapeTask;

public abstract class Shape {

    private String name;

    public Shape() {
        setName(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public abstract double area();
    public abstract double perimeter();
    public abstract void draw();



    public String toString() {
        return   name+"{" +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }

}
