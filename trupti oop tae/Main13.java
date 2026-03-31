/*A company wants to evaluate employee performance.
Create an abstract class Employee with:
● attributes: name, id
● abstract method calculateBonus()
Create subclasses:
● Manager → bonus is 20% of salary
● Developer → bonus is 10% of salary plus project incentive
Demonstrate runtime polymorphism by storing different employee objects in an
Employee reference and calling calculateBonus(). */
import java.util.Scanner;

// Abstract Class
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void calculateBonus();
}

// Manager Class
class Manager extends Employee {
    double salary;

    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    void calculateBonus() {
        double bonus = 0.20 * salary;
        System.out.println("Manager Bonus: ₹" + bonus);
    }
}

// Developer Class
class Developer extends Employee {
    double salary, incentive;

    Developer(String name, int id, double salary, double incentive) {
        super(name, id);
        this.salary = salary;
        this.incentive = incentive;
    }

    void calculateBonus() {
        double bonus = (0.10 * salary) + incentive;
        System.out.println("Developer Bonus: ₹" + bonus);
    }
}

// Main Class
public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp; // Abstract reference

        System.out.println("Choose Employee Type:");
        System.out.println("1. Manager");
        System.out.println("2. Developer");

        int choice = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        switch(choice) {
            case 1:
                emp = new Manager(name, id, salary);
                break;

            case 2:
                System.out.print("Enter Project Incentive: ");
                double incentive = sc.nextDouble();
                emp = new Developer(name, id, salary, incentive);
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Runtime Polymorphism
        emp.calculateBonus();

        sc.close();
    }
}