package org.vanier.labs.lab4;

import java.util.ArrayList;

/**
 * Task 5: Library User Roles (Abstraction & Polymorphism)
 * Goal: Design a system to represent different types of library users (Librarian, Student) using abstraction, and demonstrate their polymorphic behavior.
 * Create an abstract class LibraryUser:
 *
 * Protected fields: userId (String), name (String).
 *
 * Constructor: Initialize userId and name.
 *
 * Public concrete method: getUserDetails() (prints the user's ID and name).
 *
 * Abstract method: abstract void performDuty(); (This method should describe what a library user does, but not how each specific type does it).
 *
 * Create Concrete Library User Classes:
 *
 * Student class:
 *
 * Extends LibraryUser.
 *
 * Private field: studentId (String).
 *
 * Constructor: Initialize inherited fields using super() and its own studentId.
 *
 * Implement performDuty(): Print a message like "Student [name] is focused on studying and borrowing books."
 *
 * Librarian class:
 *
 * Extends LibraryUser.
 *
 * Private field: employeeId (String).
 *
 * Constructor: Initialize inherited fields using super() and its own employeeId.
 *
 * Implement performDuty(): Print a message like "Librarian [name] is assisting patrons and managing the collection."
 *
 * Demonstrate Abstraction and Polymorphism:
 *
 * In your main method, create an ArrayList of LibraryUser objects.
 *
 * Add instances of Student and Librarian to this list.
 *
 * Iterate through the list. For each LibraryUser object:
 *
 * Call getUserDetails().
 *
 * Call performDuty().
 *
 * Explain: How does the LibraryUser abstract class provide a common "blueprint" for different user types, and how does calling performDuty() on LibraryUser references demonstrate polymorphism?
 *
 */

public class Task5Demo {
    public static void main(String[] args) {
        // Create an ArrayList of LibraryUser references
        ArrayList<LibraryUser> users = new ArrayList<>();

        // Add Student and Librarian objects
        users.add(new Student("U100", "Mary", "S2001"));
        users.add(new Librarian("U101", "Mr. Richard", "E3001"));

        // Loop through users and invoke their behavior
        for (LibraryUser user : users) {
            user.getUserDetails();     // Calls concrete method from abstract class
            user.performDuty();        // Calls overridden method (polymorphism)
            System.out.println();
        }
    }
}

