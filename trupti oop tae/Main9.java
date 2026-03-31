/*In a Calculator class, create multiple methods named add() with different
parameter lists (e.g., one taking two integers, another taking three integers, and a
third taking two doubles).
Call the add() method with various arguments in your main program, demonstrating
that the correct method is selected at compile time based on the arguments provided. */
import java.util.Scanner;

class Calculator {

    // Method 1: add two integers
    int add(int a, int b) {
        System.out.println("Calling add(int, int)");
        return a + b;
    }

    // Method 2: add three integers
    int add(int a, int b, int c) {
        System.out.println("Calling add(int, int, int)");
        return a + b + c;
    }

    // Method 3: add two doubles
    double add(double a, double b) {
        System.out.println("Calling add(double, double)");
        return a + b;
    }
}

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Choose operation:");
        System.out.println("1. Add two integers");
        System.out.println("2. Add three integers");
        System.out.println("3. Add two doubles");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter two integers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Result: " + calc.add(a, b));
                break;

            case 2:
                System.out.print("Enter three integers: ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                System.out.println("Result: " + calc.add(x, y, z));
                break;

            case 3:
                System.out.print("Enter two double values: ");
                double d1 = sc.nextDouble();
                double d2 = sc.nextDouble();
                System.out.println("Result: " + calc.add(d1, d2));
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}