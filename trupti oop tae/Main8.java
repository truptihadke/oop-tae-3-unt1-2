/*Define an interface named Filterable with abstract methods
like apply_filter(filter_type) and reset_filter().
Create two classes, ImageProcessor and DataAnalyzer, that
both implement the Filterable interface.
Implement the methods in each class to perform distinct actions relevant to image
and data processing respectively, showcasing a shared contract with different
implementations. */

import java.util.Scanner;

// Interface
interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

// ImageProcessor class
class ImageProcessor implements Filterable {
    String currentFilter = "None";

    public void apply_filter(String filter_type) {
        currentFilter = filter_type;
        System.out.println("Applying image filter: " + filter_type);
    }

    public void reset_filter() {
        currentFilter = "None";
        System.out.println("Image filter reset.");
    }
}

// DataAnalyzer class
class DataAnalyzer implements Filterable {
    String currentFilter = "None";

    public void apply_filter(String filter_type) {
        currentFilter = filter_type;
        System.out.println("Applying data filter: " + filter_type);
    }

    public void reset_filter() {
        currentFilter = "None";
        System.out.println("Data filter reset.");
    }
}

// Main class
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create objects
        ImageProcessor img = new ImageProcessor();
        DataAnalyzer data = new DataAnalyzer();

        // User choice
        System.out.println("Choose operation:");
        System.out.println("1. Image Processing");
        System.out.println("2. Data Analysis");
        int choice = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter filter type: ");
        String filter = sc.nextLine();

        switch (choice) {
            case 1:
                img.apply_filter(filter);
                img.reset_filter();
                break;

            case 2:
                data.apply_filter(filter);
                data.reset_filter();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}