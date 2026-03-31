/*2.Design a Book class (title, author, ISBN) and a Library class that manages a
collection (e.g., an ArrayList) of Book objects. Implement methods in Library to
add a new book, remove a book by ISBN, and display all available books. */
import java.util.ArrayList;
import java.util.Scanner;

// Book class
class Book {
    String title;
    String author;
    String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

// Library class
class Library {
    ArrayList<Book> books = new ArrayList<>();

    // Constructor to add default books
    Library() {
        books.add(new Book("Java Basics", "James Gosling", "101"));
        books.add(new Book("Python Guide", "Guido van Rossum", "102"));
        books.add(new Book("C Programming", "Dennis Ritchie", "103"));
        books.add(new Book("Data Structures", "Mark Allen", "104"));
    }

    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added successfully!");
    }

    void removeBook(String isbn) {
        boolean removed = books.removeIf(b -> b.isbn.equals(isbn));
        if (removed) {
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }

    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book b : books) {
                b.display();
            }
        }
    }
}

// Main class
public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library(); // 👈 already 4 books added
        int choice;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    lib.addBook(new Book(title, author, isbn));
                    break;

                case 2:
                    System.out.print("Enter ISBN to remove: ");
                    String removeIsbn = sc.nextLine();
                    lib.removeBook(removeIsbn);
                    break;

                case 3:
                    System.out.println("\nAvailable Books:");
                    lib.displayBooks();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}