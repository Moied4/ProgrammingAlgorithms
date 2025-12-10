package org.vanier.assignments.assignment2;

// Task3.java

/**
 * Task 3: Printable Objects (OOP - Polymorphism & Abstraction)
 *
 * Goal: Use an interface to define common behavior for different objects.
 *
 * Create an IPrintable interface:
 * - Define one abstract method: void printInfo().
 *
 * Create two classes:
 *
 * Book class:
 * - Implements IPrintable.
 * - Field: title (String).
 * - Constructor.
 * - Implement printInfo(): Prints "Book Title: [title]".
 *
 * Movie class:
 * - Implements IPrintable.
 * - Field: director (String).
 * - Constructor.
 * - Implement printInfo(): Prints "Movie Director: [director]".
 *
 * Demonstrate:
 * - In a main method, create an ArrayList of IPrintable objects.
 * - Add instances of Book and Movie.
 * - Iterate through the list and call printInfo() on each object.
 *
 * -----------------------------------------------
 * Explanation:
 * - OOP Concepts Used: Polymorphism & Abstraction
 *   - Abstraction: The IPrintable interface defines a contract (printInfo()) without implementation.
 *   - Polymorphism: The ArrayList stores different types (Book, Movie) as IPrintable objects,
 *     and each calls its own version of printInfo().
 *
 * - Algorithm Complexity: O(n) – we iterate over a list of n printable objects.
 */

import java.util.ArrayList;

public class Task3 {

    // Main method to demonstrate polymorphism via the IPrintable interface
    public static void main(String[] args) {
        // Create a list of IPrintable objects
        ArrayList<IPrintable> printables = new ArrayList<>();

        // Add Book and Movie objects to the list using specified values
        printables.add(new Book("The Brothers Karamazov"));
        printables.add(new Movie("Joe Johnston")); // Director of Jumanji

        // Iterate through the list and call printInfo() on each object
        for (IPrintable item : printables) {
            item.printInfo();  // Calls the overridden method based on actual object type
        }
    }
}

/**
 * IPrintable interface representing printable behavior
 */
interface IPrintable {
    void printInfo();  // Abstract method to be implemented by all printable objects
}

/**
 * Book class implementing IPrintable
 */
class Book implements IPrintable {
    private String title;

    // Constructor to initialize book title
    public Book(String title) {
        this.title = title;
    }

    // Implement the printInfo method for Book
    @Override
    public void printInfo() {
        System.out.println("Book Title: " + title);
    }
}

/**
 * Movie class implementing IPrintable
 */
class Movie implements IPrintable {
    private String director;

    // Constructor to initialize movie director
    public Movie(String director) {
        this.director = director;
    }

    // Implement the printInfo method for Movie
    @Override
    public void printInfo() {
        System.out.println("Movie Director: " + director);
    }
}
