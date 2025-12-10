package org.vanier.labs.lab4;


/**
 * Librarian is a type of LibraryUser.
 */
public class Librarian extends LibraryUser {
    private String employeeId;

    public Librarian(String userId, String name, String employeeId) {
        super(userId, name);
        this.employeeId = employeeId;
    }

    @Override
    public void performDuty() {
        System.out.println("Librarian " + name + " is collecting books.");
    }
}
