/*Write a program to print the area of two rectangles having sides (4,5) and (5,8)
respectively by creating a class named ‘Rectangle’ with a method named ‘Area’
which returns the area and length and breadth passed as parameters to its
constructor. */

import java.util.Scanner;

class Rectangle {
    int length, breadth;

    // Constructor
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    int Area() {
        return length * breadth;
    }
}

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First rectangle
        System.out.print("Enter length and breadth of first rectangle: ");
        int l1 = sc.nextInt();
        int b1 = sc.nextInt();

        Rectangle r1 = new Rectangle(l1, b1);

        // Second rectangle
        System.out.print("Enter length and breadth of second rectangle: ");
        int l2 = sc.nextInt();
        int b2 = sc.nextInt();

        Rectangle r2 = new Rectangle(l2, b2);

        // Display areas
        System.out.println("Area of first rectangle: " + r1.Area());
        System.out.println("Area of second rectangle: " + r2.Area());
    }
}
