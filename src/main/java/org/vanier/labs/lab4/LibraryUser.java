package org.vanier.labs.lab4;

/**
 * Abstract class representing a general library user.
 */
public abstract class LibraryUser {
    protected String userId;
    protected String name;

    public LibraryUser(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    // Concrete method common to all user types
    public void getUserDetails() {
        System.out.println("User ID: " + userId + ", Name: " + name);
    }

    // Abstract method to be implemented by subclasses
    public abstract void performDuty();
}
