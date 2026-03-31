/*A bank has a fixed interest rate that should not be changed once it is defined.
Question:
Create a class Bank with a final variable interestRate.
Create a method calculateInterest(double amount) that calculates the interest using
the fixed rate.
Write a program to calculate interest for different customers. */

class Bank {
    private String bankName;
    private final double interestRate;  // Final variable - cannot be changed once initialized
    
    // Constructor to initialize bank name and interest rate
    public Bank(String bankName, double interestRate) {
        this.bankName = bankName;
        this.interestRate = interestRate;  // Initialized in constructor
    }
    
    // Getter for bank name
    public String getBankName() {
        return bankName;
    }
    
    // Getter for interest rate (final, so it's immutable)
    public double getInterestRate() {
        return interestRate;
    }
    
    // Method to calculate interest
    public double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }
    
    // Method to display interest calculation details
    public void displayInterestDetails(String customerName, double principalAmount) {
        double interest = calculateInterest(principalAmount);
        double totalAmount = principalAmount + interest;
        
        System.out.println("Customer Name: " + customerName);
        System.out.println("Principal Amount: ₹" + principalAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: ₹" + interest);
        System.out.println("Total Amount (Principal + Interest): ₹" + totalAmount);
        System.out.println();
    }
}

// Customer class to represent bank customers
class Customer {
    private String customerId;
    private String customerName;
    private double accountBalance;
    
    public Customer(String customerId, String customerName, double accountBalance) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.accountBalance = accountBalance;
    }
    
    public String getCustomerId() {
        return customerId;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public double getAccountBalance() {
        return accountBalance;
    }
}

// Main class
public class Main18 {
    public static void main(String[] args) {
        System.out.println("===== BANK INTEREST CALCULATION SYSTEM =====\n");
        
        // Create a bank with a fixed interest rate
        Bank bank = new Bank("National Bank of India", 8.5);
        
        System.out.println("Bank Name: " + bank.getBankName());
        System.out.println("Fixed Interest Rate: " + bank.getInterestRate() + "%");
        System.out.println("(This rate is final and cannot be changed)\n");
        System.out.println("===== INTEREST CALCULATIONS FOR CUSTOMERS =====\n");
        
        // Create multiple customers
        Customer customer1 = new Customer("CUST001", "Alice Smith", 50000);
        Customer customer2 = new Customer("CUST002", "Bob Johnson", 75000);
        Customer customer3 = new Customer("CUST003", "Charlie Brown", 100000);
        Customer customer4 = new Customer("CUST004", "Diana Prince", 120000);
        Customer customer5 = new Customer("CUST005", "Edward Norton", 85000);
        
        // Calculate and display interest for each customer
        bank.displayInterestDetails(customer1.getCustomerName(), customer1.getAccountBalance());
        bank.displayInterestDetails(customer2.getCustomerName(), customer2.getAccountBalance());
        bank.displayInterestDetails(customer3.getCustomerName(), customer3.getAccountBalance());
        bank.displayInterestDetails(customer4.getCustomerName(), customer4.getAccountBalance());
        bank.displayInterestDetails(customer5.getCustomerName(), customer5.getAccountBalance());
        
        // Demonstrate that the interest rate is final (immutable)
        System.out.println("===== VERIFICATION =====");
        System.out.println("Total customers served: 5");
        System.out.println("Consistent interest rate applied: " + bank.getInterestRate() + "%");
        System.out.println("\nNote: The 'final' keyword ensures the interest rate cannot be modified after initialization.");
        System.out.println("Any attempt to change it will result in a compilation error.");
    }
}
