/*A ride booking application supports different types of rides. Each ride calculates
fare differently.
Question:
Create an abstract class Ride with:
● distance
● abstract method calculateFare()
Create subclasses:
● BikeRide → fare = ₹5 per km
● AutoRide → fare = ₹8 per km
● CarRide → fare = ₹12 per km
Store different rides in a Ride array and calculate fares using runtime
polymorphism. */
import java.util.Scanner;

// Abstract Class
abstract class Ride {
    double distance;

    Ride(double distance) {
        this.distance = distance;
    }

    abstract void calculateFare();
}

// Bike Ride
class BikeRide extends Ride {
    BikeRide(double distance) {
        super(distance);
    }

    void calculateFare() {
        double fare = distance * 5;
        System.out.println("Bike Ride Fare: ₹" + fare);
    }
}

// Auto Ride
class AutoRide extends Ride {
    AutoRide(double distance) {
        super(distance);
    }

    void calculateFare() {
        double fare = distance * 8;
        System.out.println("Auto Ride Fare: ₹" + fare);
    }
}

// Car Ride
class CarRide extends Ride {
    CarRide(double distance) {
        super(distance);
    }

    void calculateFare() {
        double fare = distance * 12;
        System.out.println("Car Ride Fare: ₹" + fare);
    }
}

// Main Class
public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rides: ");
        int n = sc.nextInt();

        Ride[] rides = new Ride[n]; // Array of Ride (polymorphism)

        for(int i = 0; i < n; i++) {
            System.out.println("\nChoose Ride Type for Ride " + (i+1) + ":");
            System.out.println("1. Bike");
            System.out.println("2. Auto");
            System.out.println("3. Car");

            int choice = sc.nextInt();

            System.out.print("Enter distance (km): ");
            double distance = sc.nextDouble();

            switch(choice) {
                case 1:
                    rides[i] = new BikeRide(distance);
                    break;
                case 2:
                    rides[i] = new AutoRide(distance);
                    break;
                case 3:
                    rides[i] = new CarRide(distance);
                    break;
                default:
                    System.out.println("Invalid choice! Defaulting to Bike.");
                    rides[i] = new BikeRide(distance);
            }
        }

        System.out.println("\n--- Fare Details ---");
        for(int i = 0; i < n; i++) {
            rides[i].calculateFare(); // Runtime Polymorphism
        }

        sc.close();
    }
}