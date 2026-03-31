/*Create an abstract class Shape with an abstract method calculate_area() and a
concrete method display_info(). Create concrete subclasses
like Circle and Rectangle that must implement their own specific logic
for calculate_area(). Try to instantiate an object of the Shape class directly and
observe the compilation error. Use the subclass objects to call both abstract and
concrete methods. */
import java.util.Scanner;

// Abstract class
abstract class Shape {
    abstract double calculate_area(); // abstract method

    // concrete method
    void display_info() {
        System.out.println("This is a shape.");
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculate_area() {
        return 3.14 * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculate_area() {
        return length * breadth;
    }
}

// Main class
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        // Circle input
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        Circle c = new Circle(r);

        // Rectangle input
        System.out.print("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Rectangle rect = new Rectangle(l, b);

        // Calling methods
        System.out.println("\n--- Circle ---");
        c.display_info();
        System.out.println("Area of Circle: " + c.calculate_area());

        System.out.println("\n--- Rectangle ---");
        rect.display_info();
        System.out.println("Area of Rectangle: " + rect.calculate_area());
    }
}
