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
