/*A library wants to store details of multiple books.
Question:
Create a class Book with attributes:
 title
 author
 price
Create an array of Book objects and display the details of all books. */
class Book {
    private String title;
    private String author;
    private double price;
    
    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    // Getter methods
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public double getPrice() {
        return price;
    }
    
    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println();
    }
    
    // Method to display book info in a single line
    public String toString() {
        return "Title: " + title + " | Author: " + author + " | Price: ₹" + price;
    }
}

// Main class
public class Main19 {
    public static void main(String[] args) {
        System.out.println("===== LIBRARY BOOK MANAGEMENT SYSTEM =====\n");
        
        // Create an array of Book objects
        Book[] books = new Book[5];
        
        // Initialize the array with book objects
        books[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 499.99);
        books[1] = new Book("To Kill a Mockingbird", "Harper Lee", 599.99);
        books[2] = new Book("1984", "George Orwell", 549.99);
        books[3] = new Book("Pride and Prejudice", "Jane Austen", 449.99);
        books[4] = new Book("The Catcher in the Rye", "J.D. Salinger", 575.99);
        
        // Display all books
        System.out.println("===== LIBRARY CATALOG =====\n");
        
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book " + (i + 1) + ":");
            books[i].displayBookDetails();
        }
        
        // Summary statistics
        System.out.println("===== LIBRARY SUMMARY =====");
        System.out.println("Total number of books in the library: " + books.length);
        
        // Calculate total inventory value
        double totalValue = 0;
        for (Book book : books) {
            totalValue += book.getPrice();
        }
        System.out.println("Total inventory value: ₹" + totalValue);
        System.out.println("Average book price: ₹" + (totalValue / books.length));
        
        // Find the most expensive book
        double maxPrice = books[0].getPrice();
        String expensiveBook = books[0].getTitle();
        for (Book book : books) {
            if (book.getPrice() > maxPrice) {
                maxPrice = book.getPrice();
                expensiveBook = book.getTitle();
            }
        }
        System.out.println("Most expensive book: " + expensiveBook + " (₹" + maxPrice + ")");
        
        // Find the cheapest book
        double minPrice = books[0].getPrice();
        String cheapBook = books[0].getTitle();
        for (Book book : books) {
            if (book.getPrice() < minPrice) {
                minPrice = book.getPrice();
                cheapBook = book.getTitle();
            }
        }
        System.out.println("Cheapest book: " + cheapBook + " (₹" + minPrice + ")");
    }
}