/*20. A company wants to clearly assign constructor parameters to object variables.

Question:
Create a class Employee with variables name and salary.
Use this keyword inside the constructor to initialize object variables.
Display employee details. */

class Employee {
    private String name;
    private double salary;
    
    // Constructor using 'this' keyword to assign parameters to instance variables
    public Employee(String name, double salary) {
        this.name = name;      // 'this' refers to the current object instance
        this.salary = salary;  // Clearly assigns parameter to instance variable
    }
    
    // Getter for name
    public String getName() {
        return this.name;  // 'this' keyword usage (optional but clear)
    }
    
    // Getter for salary
    public double getSalary() {
        return this.salary;  // 'this' keyword usage (optional but clear)
    }
    
    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: ₹" + this.salary);
    }
    
    // Method to give salary increment
    public void giveIncrement(double percentageIncrease) {
        double increment = (this.salary * percentageIncrease) / 100;
        this.salary = this.salary + increment;
        System.out.println("Salary increment of " + percentageIncrease + "% applied to " + this.name);
        System.out.println("New Salary: ₹" + this.salary);
    }
    
    // Method to display employee info in a summary format
    public String toString() {
        return "Employee{" +
                "name='" + this.name + '\'' +
                ", salary=" + this.salary +
                '}';
    }
}

// Main class
public class Main20 {
    public static void main(String[] args) {
        System.out.println("===== EMPLOYEE INFORMATION SYSTEM =====\n");
        
        // Create employee objects using constructor with 'this' keyword
        Employee emp1 = new Employee("John Smith", 50000);
        Employee emp2 = new Employee("Sarah Johnson", 60000);
        Employee emp3 = new Employee("Michael Brown", 55000);
        Employee emp4 = new Employee("Emily Davis", 65000);
        
        // Display employee details
        System.out.println("===== EMPLOYEE DETAILS =====\n");
        
        System.out.println("Employee 1:");
        emp1.displayEmployeeDetails();
        System.out.println();
        
        System.out.println("Employee 2:");
        emp2.displayEmployeeDetails();
        System.out.println();
        
        System.out.println("Employee 3:");
        emp3.displayEmployeeDetails();
        System.out.println();
        
        System.out.println("Employee 4:");
        emp4.displayEmployeeDetails();
        System.out.println();
        
        // Demonstrate salary increment using 'this' keyword
        System.out.println("===== SALARY INCREMENT PROCESSING =====\n");
        emp1.giveIncrement(10);
        System.out.println();
        emp2.giveIncrement(15);
        System.out.println();
        
        // Display updated details
        System.out.println("===== UPDATED EMPLOYEE DETAILS =====\n");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());
        
        // Display all employees using toString
        System.out.println("\n===== EMPLOYEE INFORMATION SUMMARY =====");
        Employee[] employees = {emp1, emp2, emp3, emp4};
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + (i + 1) + ": " + employees[i].toString());
        }
    }
}

