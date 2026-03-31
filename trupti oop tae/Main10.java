/*10.Create an interface Bank with method getInterestRate(). Create classes SBI,
HDFC, and ICICI that implement the interface and return different interest rates.
Write a Java program to display the interest rate of each bank. */
import java.util.Scanner;

// Interface
interface Bank {
    double getInterestRate();
}

// SBI Class
class SBI implements Bank {
    public double getInterestRate() {
        return 6.5;
    }
}

// HDFC Class
class HDFC implements Bank {
    public double getInterestRate() {
        return 7.0;
    }
}

// ICICI Class
class ICICI implements Bank {
    public double getInterestRate() {
        return 6.8;
    }
}

// Main Class
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = null;

        System.out.println("Choose Bank:");
        System.out.println("1. SBI");
        System.out.println("2. HDFC");
        System.out.println("3. ICICI");

        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                bank = new SBI();
                break;
            case 2:
                bank = new HDFC();
                break;
            case 3:
                bank = new ICICI();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Interest Rate: " + bank.getInterestRate() + "%");
    }
}