/*Define a class CARRENTAL with the following details:
▪ Class Members are: CarId of int type, CarType of string type and Rent of
float type.
▪ Define GetCar() method which accepts CarId and CarType.
▪ GetRent() method which return rent of the car on the basis of car type, i.e.
Small Car = 1000, Van = 800, SUV = 2500
▪ ShowCar() method which allow user to view the contents of cars i.e. id, type
and rent. */
import java.util.Scanner;

class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    // Method to accept details
    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    // Method to calculate rent
    float GetRent() {
        if (CarType.equalsIgnoreCase("Small Car")) {
            Rent = 1000;
        } else if (CarType.equalsIgnoreCase("Van")) {
            Rent = 800;
        } else if (CarType.equalsIgnoreCase("SUV")) {
            Rent = 2500;
        } else {
            Rent = 0;
            System.out.println("Invalid Car Type!");
        }
        return Rent;
    }

    // Method to display details
    void ShowCar() {
        System.out.println("\nCar Details:");
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }
}

// Main class
public class Main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CARRENTAL c = new CARRENTAL();

        // Taking input from user
        System.out.print("Enter Car ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Car Type (Small Car / Van / SUV): ");
        String type = sc.nextLine();

        // Calling methods
        c.GetCar(id, type);
        c.GetRent();
        c.ShowCar();

        sc.close();
    }
}