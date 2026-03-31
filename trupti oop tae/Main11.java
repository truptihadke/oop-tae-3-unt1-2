/*A drawing application is being developed where different shapes can be created.
All shapes share some common properties, so a base class Shape is created with a
method display() to show general shape information.
Two specific shapes, Circle and Rectangle, inherit from the Shape class. Each shape
has its own method to calculate and display its area.
This demonstrates hierarchical inheritance, where multiple subclasses inherit from a
single base class. */
import java.util.Scanner;

// Base Class
class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

// Circle Class
class Circle extends Shape {
    double radius;

    // Default constructor (fix for your error)
    Circle() {}

    void getData(double r) {
        radius = r;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Rectangle Class
class Rectangle extends Shape {
    double length, width;

    Rectangle() {}

    void getData(double l, double w) {
        length = l;
        width = w;
    }

    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main Class
public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");

        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                Circle c = new Circle();
                c.display();
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                c.getData(r);
                c.calculateArea();
                break;

            case 2:
                Rectangle rect = new Rectangle();
                rect.display();
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter width: ");
                double w = sc.nextDouble();
                rect.getData(l, w);
                rect.calculateArea();
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}