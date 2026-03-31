/*Design a payment processing system.
Create an abstract class Payment with an abstract method pay(double amount).
Create subclasses:
● CreditCardPayment
● UPIPayment
● NetBankingPayment
Each subclass should implement the pay() method differently. */
import java.util.Scanner;

// Abstract Class
abstract class Payment {
    abstract void pay(double amount);
}

// Credit Card Payment
class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done using Credit Card.");
    }
}

// UPI Payment
class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done using UPI.");
    }
}

// Net Banking Payment
class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done using Net Banking.");
    }
}

// Main Class
public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment payment = null;

        System.out.println("Choose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");

        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        switch(choice) {
            case 1:
                payment = new CreditCardPayment();
                break;
            case 2:
                payment = new UPIPayment();
                break;
            case 3:
                payment = new NetBankingPayment();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        payment.pay(amount); // Dynamic method call

        sc.close();
    }
}