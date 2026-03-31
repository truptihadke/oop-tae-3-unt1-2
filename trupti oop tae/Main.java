/*1.Create a class called Person with name (String) and age (int) attributes. Implement a method called displayInfo() that prints the person's name and age. Create a subclass called Student that inherits from Person and adds a new attribute called studentID (String). Override the displayInfo() method in the Student class to include the student ID in the output. Finally, create an instance of the Student class and call the displayInfo() method to see the result.*/   
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating two Person objects
        Person p1 = new Person("java", 20);
        Person p2 = new Person("object", 22);

        // Printing details
        p1.display();
        p2.display();
    }
}