package org.vanier.assignments.assignment2;

// Task1.java

/**
 * Task 1: Encapsulating a Student (OOP - Encapsulation)
 *
 * Goal: Design a Student class that properly protects its data.
 *
 * Create a Student class:
 * - It should have private fields: name (String) and studentId (String).
 * - Implement a constructor to initialize both fields.
 * - Provide public getter methods for name and studentId.
 * - Do not provide any setter methods for these fields.
 * - Demonstrate: In a main method, create a Student object. Try to directly access or modify its private fields
 *   (e.g., student.name = "New Name";) and observe the compile-time error. Then, use the getter methods to print
 *   the student's details.
 *
 * -----------------------------------------------
 * Explanation:
 * - OOP Concept Used: Encapsulation
 *   The Student class encapsulates its data by declaring the fields 'name' and 'studentId' as private.
 *   This prevents external classes from modifying the data directly.
 *
 * - No setter methods are provided, so data is read-only after object creation.
 * - We use getter methods to access data safely.
 * - Attempting to access private fields directly will cause a compile-time error.
 *
 * - Algorithm Complexity: N/A (no algorithmic complexity for this task)
 */

public class Task1 {

    // The main method to demonstrate encapsulation in action
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Ali Mingda", "IKK455");

        // Try to access private fields directly (this line will cause a compile-time error if uncommented)
        // student.name = "Bob";  // ❌ Error: 'name' has private access in 'Student'
        // System.out.println(student.name);  // ❌ Error: 'name' has private access in 'Student'

        // Correct way: Use public getter methods to access data
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
    }
}

/**
 * Student class with encapsulated fields.
 * Only accessible via public getter methods.
 */
class Student {

    // Private fields – only accessible within this class
    private String name;
    private String studentId;

    /**
     * Constructor to initialize name and studentId
     */
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    /**
     * Public getter method for name
     */
    public String getName() {
        return name;
    }

    /**
     * Public getter method for studentId
     */
    public String getStudentId() {
        return studentId;
    }
}
