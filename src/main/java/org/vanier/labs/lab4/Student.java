package org.vanier.labs.lab4;

/**
 * Student is a type of LibraryUser.
 */
public class Student extends LibraryUser {
    private String studentId;

    public Student(String userId, String name, String studentId) {
        super(userId, name);
        this.studentId = studentId;
    }

    @Override
    public void performDuty() {
        System.out.println("Student " + name + " is studying in the library.");
    }
}
