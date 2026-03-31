/*Create a base class Person with method role().
Create subclasses:
● Employee
● Manager (extends Employee)
Override role() in each class and demonstrate multilevel inheritance with runtime
polymorphism. */
import java.util.Scanner;

// Base Class
class Person {
    void role() {
        System.out.println("I am a Person.");
    }
}

// Employee Class (Level 2)
class Employee extends Person {
    void role() {
        System.out.println("I am an Employee.");
    }
}

// Manager Class (Level 3)
class Manager extends Employee {
    void role() {
        System.out.println("I am a Manager.");
    }
}

// Main Class
public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p; // Base class reference

        System.out.println("Choose Role:");
        System.out.println("1. Person");
        System.out.println("2. Employee");
        System.out.println("3. Manager");

        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                p = new Person();
                break;
            case 2:
                p = new Employee();
                break;
            case 3:
                p = new Manager();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Runtime Polymorphism
        p.role();

        sc.close();
    }
}