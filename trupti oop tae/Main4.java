/*Define a class Resort with the following description:
▪ Members are: RNo to store Room Number, Name store customer name,
Charges to store per day charges, Days to store number of days of stay.
▪ Member functions:
▪ Compute() to calculate and return Amount as Days * Charges and if the
values of Days*Charges is more than 11000 then as 1.02*Days*Charges
▪ Getinfo() A function to enter the content Rno, Name, Charges and Days.
▪ DispInfo() A function to enter the content Rno, Name, Charges, Days and
Amount by calling function Compute(). */
import java.util.Scanner;

class Resort {
    int RNo;
    String Name;
    float Charges;
    int Days;
    float Amount;

    // Function to input details
    void GetInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room Number: ");
        RNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Charges per day: ");
        Charges = sc.nextFloat();

        System.out.print("Enter Number of Days: ");
        Days = sc.nextInt();
    }

    // Function to compute amount
    float Compute() {
        float total = Days * Charges;

        if (total > 11000) {
            total = 1.02f * total; // 2% extra
        }

        return total;
    }

    // Function to display details
    void DispInfo() {
        Amount = Compute();

        System.out.println("\n--- Resort Details ---");
        System.out.println("Room No: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per Day: " + Charges);
        System.out.println("Days Stayed: " + Days);
        System.out.println("Total Amount: " + Amount);
    }
}

// Main class
public class Main4 {
    public static void main(String[] args) {

        Resort r = new Resort();
        Scanner sc = new Scanner(System.in);
        r.GetInfo();   // input from user
        r.DispInfo();  // display details

    }
}