/*A company wants to track how many employees have been created in the
system.
Question:
Create a class Employee with attributes name and id.
Use a static variable employeeCount that increases every time a new object is
created.
Write a program that:
 Creates multiple employee objects
 Displays the total number of employees using a static method */
class Employee {
    private String name;
    private String id;
    private static int employeeCount = 0;  // Static variable shared by all instances
    
    // Constructor
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
        employeeCount++;  // Increment count when a new employee is created
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
    
    // Static method to get total employee count
    public static int getTotalEmployees() {
        return employeeCount;
    }
    
    // Static method to display employee information
    public static void displayTotalEmployees() {
        System.out.println("Total number of employees in the system: " + employeeCount);
    }
    
    // Instance method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name + " | Employee ID: " + id);
    }
}

// Main class
public class Main17 {
    public static void main(String[] args) {
        System.out.println("===== EMPLOYEE TRACKING SYSTEM =====\n");
        
        // Initially, no employees
        System.out.println("Initial employee count: " + Employee.getTotalEmployees());
        System.out.println();
        
        // Create multiple employee objects
        System.out.println("Creating employees...\n");
        
        Employee employee1 = new Employee("John Smith", "EMP001");
        employee1.displayEmployeeInfo();
        System.out.println("Current employee count: " + Employee.getTotalEmployees());
        System.out.println();
        
        Employee employee2 = new Employee("Sarah Johnson", "EMP002");
        employee2.displayEmployeeInfo();
        System.out.println("Current employee count: " + Employee.getTotalEmployees());
        System.out.println();
        
        Employee employee3 = new Employee("Michael Brown", "EMP003");
        employee3.displayEmployeeInfo();
        System.out.println("Current employee count: " + Employee.getTotalEmployees());
        System.out.println();
        
        Employee employee4 = new Employee("Emily Davis", "EMP004");
        employee4.displayEmployeeInfo();
        System.out.println("Current employee count: " + Employee.getTotalEmployees());
        System.out.println();
        
        Employee employee5 = new Employee("Christopher Wilson", "EMP005");
        employee5.displayEmployeeInfo();
        System.out.println("Current employee count: " + Employee.getTotalEmployees());
        System.out.println();
        
        // Display total employees using static method
        System.out.println("===== SUMMARY =====");
        Employee.displayTotalEmployees();
        System.out.println("Total employees retrieved: " + Employee.getTotalEmployees());
    }
}
