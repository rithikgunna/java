//This program illustrates the use of abstract classes and methods. The Shape class is abstract and defines an abstract method area(). The Circle and Rectangle classes extend the abstract Shape class and provide implementations for the area() method.
abstract class Shape {
    abstract double area();

    void displayInfo() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());

        circle.displayInfo();
        rectangle.displayInfo();
    }
}
