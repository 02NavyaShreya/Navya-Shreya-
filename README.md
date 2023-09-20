import java.util.Scanner;
abstract class Shape {
    int numSides;
    public Shape(int numSides) {
        this.numSides = numSides;
    }
    public int getNumSides() {
        return numSides;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        super(4); 
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape {
    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        super(3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width and height for the rectangle: ");
        double rectWidth = scanner.nextDouble();
        double rectHeight = scanner.nextDouble();

        System.out.print("Enter lengths of the three sides for the triangle: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(rectWidth, rectHeight);
        Triangle triangle = new Triangle(side1, side2, side3);

        System.out.println("\nRectangle:");
        System.out.println("Number of sides: " + rectangle.getNumSides());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println("\nTriangle:");
        System.out.println("Number of sides: " + triangle.getNumSides());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
import java.util.Scanner;

interface Resizable {
    void resize(double factor);
}

class Rectangle implements Resizable {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public void resize(double factor) {
        this.length *= factor;
        this.breadth *= factor;
    }
}

class Circle implements Resizable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void resize(double factor) {
        this.radius *= factor;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length and breadth for the rectangle: ");
        double lengthRectangle = scanner.nextDouble();
        double breadthRectangle = scanner.nextDouble();

        System.out.print("Enter radius for the circle: ");
        double radiusCircle = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(lengthRectangle, breadthRectangle);
        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter());
        rectangle.resize(5);
        System.out.println("Resized Area of rectangle: " + rectangle.area());
        System.out.println("Resized Perimeter of rectangle: " + rectangle.perimeter());

        Circle circle = new Circle(radiusCircle);
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Circumference of circle: " + circle.circumference());
        circle.resize(10);
        System.out.println("Resized Area of circle: " + circle.area());
        System.out.println("Resized Circumference of circle: " + circle.circumference());
    }
}
